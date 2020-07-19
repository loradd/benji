package se.mdh.idt.benji.examples.models20.ecore;

import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.xtext.xbase.lib.Extension;
import se.mdh.idt.benji.difference.api.Difference;
import se.mdh.idt.benji.difference.api.DifferenceFactory;
import se.mdh.idt.benji.examples.metamodels.ecore.Reference;
import se.mdh.idt.benji.examples.models20.ecore.ExchangeLocationOfElementsPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.ExchangeLocationOfElementsPrecondition;
import se.mdh.idt.benji.examples.models20.ecore.MoveElementPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.MoveElementPrecondition;
import se.mdh.idt.benji.examples.models20.ecore.MoveRenamedElementPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.MoveRenamedElementPrecondition;
import se.mdh.idt.benji.examples.models20.ecore.RenameElementPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.RenameElementPrecondition;
import se.mdh.idt.benji.examples.models20.ecore.UpdateReferenceTargetPostcondition;
import se.mdh.idt.benji.examples.models20.ecore.UpdateReferenceTargetPrecondition;

@SuppressWarnings("all")
public class Differences {
  @Extension
  private static EcoreFactory _ecoreFactory = EcoreFactory.eINSTANCE;
  
  public static final Difference<MoveElementPrecondition.Match, MoveElementPrecondition.Matcher, MoveElementPrecondition, MoveElementPostcondition.Match, MoveElementPostcondition.Matcher, MoveElementPostcondition, Consumer<MoveElementPrecondition.Match>> moveElement = DifferenceFactory.<MoveElementPrecondition.Match, MoveElementPrecondition.Matcher, MoveElementPrecondition, MoveElementPostcondition.Match, MoveElementPostcondition.Matcher, MoveElementPostcondition, Consumer<MoveElementPrecondition.Match>>difference().name("Move Element").precondition(MoveElementPrecondition.instance()).action(
    ((Consumer<MoveElementPrecondition.Match>) (MoveElementPrecondition.Match it) -> {
      final EPackage eSubPackage = Differences._ecoreFactory.createEPackage();
      eSubPackage.setName("shop");
      EList<EClassifier> _eClassifiers = eSubPackage.getEClassifiers();
      EObject _current = it.getEClass().getCurrent();
      _eClassifiers.add(((EClass) _current));
      EObject _current_1 = it.getEPackage().getCurrent();
      EList<EPackage> _eSubpackages = ((EPackage) _current_1).getESubpackages();
      _eSubpackages.add(eSubPackage);
    })).postcondition(MoveElementPostcondition.instance()).build();
  
  public static final Difference<RenameElementPrecondition.Match, RenameElementPrecondition.Matcher, RenameElementPrecondition, RenameElementPostcondition.Match, RenameElementPostcondition.Matcher, RenameElementPostcondition, Consumer<RenameElementPrecondition.Match>> renameElement = DifferenceFactory.<RenameElementPrecondition.Match, RenameElementPrecondition.Matcher, RenameElementPrecondition, RenameElementPostcondition.Match, RenameElementPostcondition.Matcher, RenameElementPostcondition, Consumer<RenameElementPrecondition.Match>>difference().name("Rename Element").precondition(RenameElementPrecondition.instance()).action(
    ((Consumer<RenameElementPrecondition.Match>) (RenameElementPrecondition.Match it) -> {
      EObject _current = it.getEClass().getCurrent();
      ((EClass) _current).setName("Pet");
      EObject _current_1 = it.getEAttribute().getCurrent();
      ((EAttribute) _current_1).setName("moniker");
    })).postcondition(RenameElementPostcondition.instance()).build();
  
  public static final Difference<MoveRenamedElementPrecondition.Match, MoveRenamedElementPrecondition.Matcher, MoveRenamedElementPrecondition, MoveRenamedElementPostcondition.Match, MoveRenamedElementPostcondition.Matcher, MoveRenamedElementPostcondition, Consumer<MoveRenamedElementPrecondition.Match>> moveRenamedElement = DifferenceFactory.<MoveRenamedElementPrecondition.Match, MoveRenamedElementPrecondition.Matcher, MoveRenamedElementPrecondition, MoveRenamedElementPostcondition.Match, MoveRenamedElementPostcondition.Matcher, MoveRenamedElementPostcondition, Consumer<MoveRenamedElementPrecondition.Match>>difference().name("Move Renamed Element").precondition(MoveRenamedElementPrecondition.instance()).action(
    ((Consumer<MoveRenamedElementPrecondition.Match>) (MoveRenamedElementPrecondition.Match it) -> {
      EObject _current = it.getEClass().getCurrent();
      ((EClass) _current).setName("Pet");
      EObject _current_1 = it.getEAttribute().getCurrent();
      ((EAttribute) _current_1).setName("moniker");
      final EPackage eSubPackage = Differences._ecoreFactory.createEPackage();
      eSubPackage.setName("shop");
      EList<EClassifier> _eClassifiers = eSubPackage.getEClassifiers();
      EObject _current_2 = it.getEClass().getCurrent();
      _eClassifiers.add(((EClass) _current_2));
      EObject _current_3 = it.getEPackage().getCurrent();
      EList<EPackage> _eSubpackages = ((EPackage) _current_3).getESubpackages();
      _eSubpackages.add(eSubPackage);
    })).postcondition(MoveRenamedElementPostcondition.instance()).build();
  
  public static final Difference<ExchangeLocationOfElementsPrecondition.Match, ExchangeLocationOfElementsPrecondition.Matcher, ExchangeLocationOfElementsPrecondition, ExchangeLocationOfElementsPostcondition.Match, ExchangeLocationOfElementsPostcondition.Matcher, ExchangeLocationOfElementsPostcondition, Consumer<ExchangeLocationOfElementsPrecondition.Match>> exchangeLocationOfElements = DifferenceFactory.<ExchangeLocationOfElementsPrecondition.Match, ExchangeLocationOfElementsPrecondition.Matcher, ExchangeLocationOfElementsPrecondition, ExchangeLocationOfElementsPostcondition.Match, ExchangeLocationOfElementsPostcondition.Matcher, ExchangeLocationOfElementsPostcondition, Consumer<ExchangeLocationOfElementsPrecondition.Match>>difference().name("Exchange Location of Elements").precondition(ExchangeLocationOfElementsPrecondition.instance()).action(
    ((Consumer<ExchangeLocationOfElementsPrecondition.Match>) (ExchangeLocationOfElementsPrecondition.Match it) -> {
      EObject _current = it.getELeftPackage().getCurrent();
      EList<EClassifier> _eClassifiers = ((EPackage) _current).getEClassifiers();
      EObject _current_1 = it.getERightClass().getCurrent();
      _eClassifiers.add(((EClass) _current_1));
      EObject _current_2 = it.getERightPackage().getCurrent();
      EList<EClassifier> _eClassifiers_1 = ((EPackage) _current_2).getEClassifiers();
      EObject _current_3 = it.getELeftClass().getCurrent();
      _eClassifiers_1.add(((EClass) _current_3));
    })).postcondition(ExchangeLocationOfElementsPostcondition.instance()).build();
  
  public static final Difference<UpdateReferenceTargetPrecondition.Match, UpdateReferenceTargetPrecondition.Matcher, UpdateReferenceTargetPrecondition, UpdateReferenceTargetPostcondition.Match, UpdateReferenceTargetPostcondition.Matcher, UpdateReferenceTargetPostcondition, Consumer<UpdateReferenceTargetPrecondition.Match>> updateReferenceTarget = DifferenceFactory.<UpdateReferenceTargetPrecondition.Match, UpdateReferenceTargetPrecondition.Matcher, UpdateReferenceTargetPrecondition, UpdateReferenceTargetPostcondition.Match, UpdateReferenceTargetPostcondition.Matcher, UpdateReferenceTargetPostcondition, Consumer<UpdateReferenceTargetPrecondition.Match>>difference().name("Update Reference Target").precondition(UpdateReferenceTargetPrecondition.instance()).action(
    ((Consumer<UpdateReferenceTargetPrecondition.Match>) (UpdateReferenceTargetPrecondition.Match it) -> {
      EObject _current = it.getEReference().getCurrent();
      EObject _current_1 = it.getETargetReferenceType().getCurrent();
      ((Reference) _current).setType(((se.mdh.idt.benji.examples.metamodels.ecore.Class) _current_1));
    })).postcondition(UpdateReferenceTargetPostcondition.instance()).build();
}
