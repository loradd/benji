package se.mdh.idt.benji.examples.models20

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
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.change.util.ChangeRecorder
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Package

import static se.mdh.idt.benji.benchmark.api.Benchmark.ALL
import static se.mdh.idt.benji.benchmark.api.BenchmarkFactory.benchmark

class Main {
	
	def static void main(String[] args) {
		generateModelsWithBenji
		compareModelsWithEMFCompare
	}
	
	private static def generateModelsWithBenji() {
		generateEcoreModelsWithBenji
		generateBpmn2ModelsWithBenji
	}
	
	private static def compareModelsWithEMFCompare() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		compareModelsWithEMFCompare(se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Package.eINSTANCE)
		compareModelsWithEMFCompare(se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage.eINSTANCE)
	}
	
	private static def generateEcoreModelsWithBenji() {
		benchmark
			.metamodel(EcorePackage.eINSTANCE)
			.metamodel(se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage.eINSTANCE)
			.model("resources/benji/input/ecore/ecore_1.xmi")
			.difference(0, 1, se.mdh.idt.benji.examples.models20.ecore.Differences.moveElement)
			.difference(0, 1, se.mdh.idt.benji.examples.models20.ecore.Differences.renameElement)
			.difference(0, 1, se.mdh.idt.benji.examples.models20.ecore.Differences.moveRenamedElement)
			.build.generate(ALL, "resources/benji/output/ecore")
		benchmark
			.metamodel(EcorePackage.eINSTANCE)
			.metamodel(se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage.eINSTANCE)
			.model("resources/benji/input/ecore/ecore_2.xmi")
			.difference(0, 1, se.mdh.idt.benji.examples.models20.ecore.Differences.exchangeLocationOfElements)
			.build.generate(ALL, "resources/benji/output/ecore")
		benchmark
			.metamodel(EcorePackage.eINSTANCE)
			.metamodel(se.mdh.idt.benji.examples.metamodels.ecore.EcorePackage.eINSTANCE)
			.model("resources/benji/input/ecore/ecore_3.xmi")
			.difference(0, 1, se.mdh.idt.benji.examples.models20.ecore.Differences.updateReferenceTarget)
			.build.generate(ALL, "resources/benji/output/ecore")
	}
	
	private static def generateBpmn2ModelsWithBenji() {
		benchmark
			.metamodel(Bpmn2Package.eINSTANCE)
			.model("resources/benji/input/bpmn2/bpmn2_1.xmi")
			.difference(0, 1, se.mdh.idt.benji.examples.models20.bpmn2.Differences.moveElement)
			.difference(0, 1, se.mdh.idt.benji.examples.models20.bpmn2.Differences.renameElement)
			.difference(0, 1, se.mdh.idt.benji.examples.models20.bpmn2.Differences.moveRenamedElement)
			.build.generate(ALL, "resources/benji/output/bpmn2")
		benchmark
			.metamodel(Bpmn2Package.eINSTANCE)
			.model("resources/benji/input/bpmn2/bpmn2_2.xmi")
			.difference(0, 1, se.mdh.idt.benji.examples.models20.bpmn2.Differences.exchangeLocationOfElements)
			.build.generate(ALL, "resources/benji/output/bpmn2")
		benchmark
			.metamodel(Bpmn2Package.eINSTANCE)
			.model("resources/benji/input/bpmn2/bpmn2_3.xmi")
			.difference(0, 1, se.mdh.idt.benji.examples.models20.bpmn2.Differences.updateReferenceTarget)
			.build.generate(ALL, "resources/benji/output/bpmn2")
	}
	
	private static def compareModelsWithEMFCompare(EPackage metamodel) {
		// register metamodel
		EPackage.Registry.INSTANCE.put(metamodel.nsURI, metamodel)
		// initialize paths
		val inputModelsPath = Paths.get("resources", "benji", "input", metamodel.name)
		val outputFoldersPath = Paths.get("resources", "benji", "output", metamodel.name)
		val resultFoldersPath = Paths.get("resources", "emf_compare", metamodel.name)
		// map input models with their names
		val inputModelsMap = Files.list(inputModelsPath)
			 .collect(Collectors.groupingBy[inputModelPath|inputModelPath.last.toString])
		// iterate over output models (except for deltas)
		Files.list(outputFoldersPath)
			 .flatMap[outputFolderPath|Files.list(outputFolderPath)]
			 .filter[outputModelPath|!"Delta.xmi".equals(outputModelPath.last.toString)]
			 .collect(Collectors.groupingBy[outputModelPath|inputModelsMap.get(outputModelPath.last.toString).head])
			 .forEach[inputModelPath, outputModelPaths |
			 	outputModelPaths.forEach[outputModelPath|
					// load input/output models
			 		val resourceSet = new ResourceSetImpl
			 		val inputModelResource = resourceSet.getResource(URI.createFileURI(inputModelPath.toAbsolutePath.toString), true)
			 		val outputModelResource = resourceSet.getResource(URI.createFileURI(outputModelPath.toAbsolutePath.toString), true)
			 		// compare models and store comparison
			 		val comparisonScope = new DefaultComparisonScope(inputModelResource, outputModelResource, null)
			 		val comparison = EMFCompare.builder().build.compare(comparisonScope)
			 		val comparisonResource = new XMIResourceImpl(
			 			URI.createFileURI(Paths.get(resultFoldersPath.toString, outputModelPath.parent.last.toString, "Comparison.xmi").toAbsolutePath.toString))
			 		val copier = new Copier(false)
			 		val comparisonCopy = copier.copy(comparison)
			 		copier.copyReferences
			 		comparisonResource.contents.add(comparisonCopy)
			 		comparisonResource.save(newHashMap)
			 		// edit models according to emf compare
			 		val eObjectToProxyURIMap = new HashMap<EObject, URI>
			 		val changeRecorder = new ChangeRecorder
			 		changeRecorder.EObjectToProxyURIMap = eObjectToProxyURIMap
			 		changeRecorder.beginRecording(#[inputModelResource])
			 		val merger = new BatchMerger(IMerger.RegistryImpl.createStandaloneInstance)
			 		merger.copyAllRightToLeft(comparison.differences, new BasicMonitor)
			 		// store change description
			 		val changeDescription = changeRecorder.endRecording
			 		changeDescription.copyAndReverse(eObjectToProxyURIMap)
			 		val changeDescriptionResource = new XMIResourceImpl(
			 			URI.createFileURI(Paths.get(resultFoldersPath.toString, outputModelPath.parent.last.toString, "Delta.xmi").toAbsolutePath.toString))
	 				changeDescriptionResource.contents.add(changeDescription)
	 				changeDescriptionResource.save(newHashMap)	
	 			]
			 ]
	}
	
}