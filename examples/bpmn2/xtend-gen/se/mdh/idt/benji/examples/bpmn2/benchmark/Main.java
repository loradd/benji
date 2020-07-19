package se.mdh.idt.benji.examples.bpmn2.benchmark;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import se.mdh.idt.benji.benchmark.api.Benchmark;
import se.mdh.idt.benji.benchmark.api.BenchmarkFactory;
import se.mdh.idt.benji.examples.bpmn2.Bpmn2Package;
import se.mdh.idt.benji.examples.bpmn2.benchmark.Differences;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    Main.generateModelsWithBenji();
    Main.generateEMFCompareResults();
  }
  
  public static void generateModelsWithBenji() {
    try {
      BenchmarkFactory.benchmark().metamodel(Bpmn2Package.eINSTANCE).model("benchmark/input/bpmn2_1.xmi").difference(0, 1, Differences.moveElement).difference(0, 1, Differences.renameElement).difference(0, 1, Differences.moveRenamedElement).build().generate(Benchmark.ALL, "benchmark/output");
      BenchmarkFactory.benchmark().metamodel(Bpmn2Package.eINSTANCE).model("benchmark/input/bpmn2_2.xmi").difference(0, 1, Differences.exchangeLocationOfElements).build().generate(Benchmark.ALL, "benchmark/output");
      BenchmarkFactory.benchmark().metamodel(Bpmn2Package.eINSTANCE).model("benchmark/input/bpmn2_3.xmi").difference(0, 1, Differences.updateReferenceTarget).build().generate(Benchmark.ALL, "benchmark/output");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void generateEMFCompareResults() {
    try {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      EPackage.Registry.INSTANCE.put(Bpmn2Package.eNS_URI, 
        Bpmn2Package.eINSTANCE);
      final Function<Path, String> _function = (Path inputModelPath) -> {
        return IterableExtensions.<Path>last(inputModelPath).toString();
      };
      final Map<String, List<Path>> inputModelsMap = Files.list(Paths.get("benchmark", "input")).collect(Collectors.<Path, String>groupingBy(_function));
      final Function<Path, Stream<Path>> _function_1 = (Path outputFolderPath) -> {
        try {
          return Files.list(outputFolderPath);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      final Predicate<Path> _function_2 = (Path outputModelPath) -> {
        boolean _equals = "Delta.xmi".equals(IterableExtensions.<Path>last(outputModelPath).toString());
        return (!_equals);
      };
      final Function<Path, Path> _function_3 = (Path outputModelPath) -> {
        return IterableExtensions.<Path>head(inputModelsMap.get(IterableExtensions.<Path>last(outputModelPath).toString()));
      };
      final BiConsumer<Path, List<Path>> _function_4 = (Path inputModelPath, List<Path> outputModelPaths) -> {
        final Consumer<Path> _function_5 = (Path outputModelPath) -> {
          try {
            final ResourceSetImpl resourceSet = new ResourceSetImpl();
            final Resource inputModelResource = resourceSet.getResource(URI.createFileURI(inputModelPath.toAbsolutePath().toString()), true);
            final Resource outputModelResource = resourceSet.getResource(URI.createFileURI(outputModelPath.toAbsolutePath().toString()), true);
            final DefaultComparisonScope comparisonScope = new DefaultComparisonScope(inputModelResource, outputModelResource, null);
            final Comparison comparison = EMFCompare.builder().build().compare(comparisonScope);
            URI _createFileURI = URI.createFileURI(Paths.get("benchmark", "output", IterableExtensions.<Path>last(outputModelPath.getParent()).toString(), "emf-compare", "Comparison.xmi").toAbsolutePath().toString());
            final XMIResourceImpl comparisonResource = new XMIResourceImpl(_createFileURI);
            final EcoreUtil.Copier copier = new EcoreUtil.Copier(false);
            final EObject comparisonCopy = copier.copy(comparison);
            copier.copyReferences();
            comparisonResource.getContents().add(comparisonCopy);
            comparisonResource.save(CollectionLiterals.<Object, Object>newHashMap());
            final HashMap<EObject, URI> eObjectToProxyURIMap = new HashMap<EObject, URI>();
            final ChangeRecorder changeRecorder = new ChangeRecorder();
            changeRecorder.setEObjectToProxyURIMap(eObjectToProxyURIMap);
            changeRecorder.beginRecording(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(inputModelResource)));
            IMerger.Registry _createStandaloneInstance = IMerger.RegistryImpl.createStandaloneInstance();
            final BatchMerger merger = new BatchMerger(_createStandaloneInstance);
            EList<Diff> _differences = comparison.getDifferences();
            BasicMonitor _basicMonitor = new BasicMonitor();
            merger.copyAllRightToLeft(_differences, _basicMonitor);
            final ChangeDescription changeDescription = changeRecorder.endRecording();
            changeDescription.copyAndReverse(eObjectToProxyURIMap);
            URI _createFileURI_1 = URI.createFileURI(Paths.get("benchmark", "output", IterableExtensions.<Path>last(outputModelPath.getParent()).toString(), "emf-compare", "Delta.xmi").toAbsolutePath().toString());
            final XMIResourceImpl changeDescriptionResource = new XMIResourceImpl(_createFileURI_1);
            changeDescriptionResource.getContents().add(changeDescription);
            changeDescriptionResource.save(CollectionLiterals.<Object, Object>newHashMap());
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        outputModelPaths.forEach(_function_5);
      };
      Files.list(Paths.get("benchmark", "output")).<Path>flatMap(_function_1).filter(_function_2).collect(Collectors.<Path, Path>groupingBy(_function_3)).forEach(_function_4);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
