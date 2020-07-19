package se.mdh.idt.benji.examples.bpmn2.benchmark

import se.mdh.idt.benji.examples.bpmn2.Bpmn2Package

import static se.mdh.idt.benji.benchmark.api.Benchmark.ALL
import static se.mdh.idt.benji.benchmark.api.BenchmarkFactory.benchmark
import static se.mdh.idt.benji.examples.bpmn2.benchmark.Differences.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Collectors
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.change.util.ChangeRecorder
import org.eclipse.emf.compare.merge.IMerger
import org.eclipse.emf.compare.merge.BatchMerger
import org.eclipse.emf.common.util.BasicMonitor

class Main {
	
	def static void main(String[] args) {
		generateModelsWithBenji /* and */ generateEMFCompareResults
	}
	
	def static void generateModelsWithBenji() {
		benchmark
			.metamodel(Bpmn2Package.eINSTANCE)
			.model("benchmark/input/bpmn2_1.xmi")
			.difference(0, 1, moveElement)
			.difference(0, 1, renameElement)
			.difference(0, 1, moveRenamedElement)
			.build.generate(ALL, "benchmark/output")
		benchmark
			.metamodel(Bpmn2Package.eINSTANCE)
			.model("benchmark/input/bpmn2_2.xmi")
			.difference(0, 1, exchangeLocationOfElements)
			.build.generate(ALL, "benchmark/output")
		benchmark
			.metamodel(Bpmn2Package.eINSTANCE)
			.model("benchmark/input/bpmn2_3.xmi")
			.difference(0, 1, updateReferenceTarget)
			.build.generate(ALL, "benchmark/output")
	}
	
	def static void generateEMFCompareResults() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		EPackage.Registry.INSTANCE.put(Bpmn2Package.eNS_URI,
			Bpmn2Package.eINSTANCE)
		val inputModelsMap = Files.list(Paths.get("benchmark", "input"))
			 .collect(Collectors.groupingBy[inputModelPath|inputModelPath.last.toString])
		Files.list(Paths.get("benchmark", "output"))
			 .flatMap[outputFolderPath|Files.list(outputFolderPath)]
			 .filter[outputModelPath|!"Delta.xmi".equals(outputModelPath.last.toString)]
			 .collect(Collectors.groupingBy[outputModelPath|inputModelsMap.get(outputModelPath.last.toString).head])
			 .forEach[inputModelPath, outputModelPaths |
			 	outputModelPaths.forEach[outputModelPath|
			 		val resourceSet = new ResourceSetImpl
			 		val inputModelResource = resourceSet.getResource(URI.createFileURI(inputModelPath.toAbsolutePath.toString), true)
			 		val outputModelResource = resourceSet.getResource(URI.createFileURI(outputModelPath.toAbsolutePath.toString), true)
			 		val comparisonScope = new DefaultComparisonScope(inputModelResource, outputModelResource, null)
			 		val comparison = EMFCompare.builder().build.compare(comparisonScope)
			 		val comparisonResource = new XMIResourceImpl(
			 			URI.createFileURI(Paths.get("benchmark", "output", outputModelPath.parent.last.toString, "emf-compare", "Comparison.xmi").toAbsolutePath.toString))
			 		val copier = new Copier(false)
			 		val comparisonCopy = copier.copy(comparison)
			 		copier.copyReferences
			 		comparisonResource.contents.add(comparisonCopy)
			 		comparisonResource.save(newHashMap)
			 		val eObjectToProxyURIMap = new HashMap<EObject, URI>
			 		val changeRecorder = new ChangeRecorder
			 		changeRecorder.EObjectToProxyURIMap = eObjectToProxyURIMap
			 		changeRecorder.beginRecording(#[inputModelResource])
			 		val merger = new BatchMerger(IMerger.RegistryImpl.createStandaloneInstance)
			 		merger.copyAllRightToLeft(comparison.differences, new BasicMonitor)
			 		val changeDescription = changeRecorder.endRecording
			 		changeDescription.copyAndReverse(eObjectToProxyURIMap)
			 		val changeDescriptionResource = new XMIResourceImpl(
			 			URI.createFileURI(Paths.get("benchmark", "output", outputModelPath.parent.last.toString, "emf-compare", "Delta.xmi").toAbsolutePath.toString))
	 				changeDescriptionResource.contents.add(changeDescription)
	 				changeDescriptionResource.save(newHashMap)	
	 			]
			 ]
	}
	
}