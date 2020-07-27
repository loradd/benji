package se.mdh.idt.benji.examples.ecore.benchmark

import java.nio.file.Files
import java.nio.file.Paths
import java.util.HashMap
import java.util.stream.Collectors
import org.eclipse.emf.common.util.BasicMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.merge.BatchMerger
import org.eclipse.emf.compare.merge.IMerger
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.change.util.ChangeRecorder
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import se.mdh.idt.benji.examples.ecore.EcorePackage

import static se.mdh.idt.benji.benchmark.api.Benchmark.ALL
import static se.mdh.idt.benji.benchmark.api.BenchmarkFactory.benchmark
import static se.mdh.idt.benji.examples.ecore.benchmark.Differences.*

class Main {
	
	def static void main(String[] args) {
		generateModelsWithBenji /* and */ generateEMFCompareResults
	}
	
	def static void generateModelsWithBenji() {
		benchmark
			.metamodel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE)
			.metamodel(EcorePackage.eINSTANCE)
			.model("benchmark/input/ecore_1.xmi")
			.difference(0, 1, moveElement)
			.difference(0, 1, renameElement)
			.difference(0, 1, moveRenamedElement)
			.build.generate(ALL, "benchmark/output")
		benchmark
			.metamodel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE)
			.metamodel(EcorePackage.eINSTANCE)
			.model("benchmark/input/ecore_2.xmi")
			.difference(0, 1, exchangeLocationOfElements)
			.build.generate(ALL, "benchmark/output")
		benchmark
			.metamodel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE)
			.metamodel(EcorePackage.eINSTANCE)
			.model("benchmark/input/ecore_3.xmi")
			.difference(0, 1, updateReferenceTarget)
			.build.generate(ALL, "benchmark/output")
	}
	
	def static void generateEMFCompareResults() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI,
			EcorePackage.eINSTANCE)
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