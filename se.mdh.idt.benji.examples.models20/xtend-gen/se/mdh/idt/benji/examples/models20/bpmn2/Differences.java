package se.mdh.idt.benji.examples.models20.bpmn2;

import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import se.mdh.idt.benji.difference.api.Difference;
import se.mdh.idt.benji.difference.api.DifferenceFactory;
import se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Factory;
import se.mdh.idt.benji.examples.metamodels.bpmn2.EndEvent;
import se.mdh.idt.benji.examples.metamodels.bpmn2.FlowElement;
import se.mdh.idt.benji.examples.metamodels.bpmn2.SequenceFlow;
import se.mdh.idt.benji.examples.metamodels.bpmn2.StartEvent;
import se.mdh.idt.benji.examples.metamodels.bpmn2.SubProcess;
import se.mdh.idt.benji.examples.metamodels.bpmn2.Task;
import se.mdh.idt.benji.examples.models20.bpmn2.ExchangeLocationOfElementsPostcondition;
import se.mdh.idt.benji.examples.models20.bpmn2.ExchangeLocationOfElementsPrecondition;
import se.mdh.idt.benji.examples.models20.bpmn2.MoveElementPostcondition;
import se.mdh.idt.benji.examples.models20.bpmn2.MoveElementPrecondition;
import se.mdh.idt.benji.examples.models20.bpmn2.MoveRenamedElementPostcondition;
import se.mdh.idt.benji.examples.models20.bpmn2.MoveRenamedElementPrecondition;
import se.mdh.idt.benji.examples.models20.bpmn2.RenameElementPostcondition;
import se.mdh.idt.benji.examples.models20.bpmn2.RenameElementPrecondition;
import se.mdh.idt.benji.examples.models20.bpmn2.UpdateReferenceTargetPostcondition;
import se.mdh.idt.benji.examples.models20.bpmn2.UpdateReferenceTargetPrecondition;

@SuppressWarnings("all")
public class Differences {
  @Extension
  private static Bpmn2Factory _bpmn2Factory = Bpmn2Factory.eINSTANCE;
  
  public static final Difference<MoveElementPrecondition.Match, MoveElementPrecondition.Matcher, MoveElementPrecondition, MoveElementPostcondition.Match, MoveElementPostcondition.Matcher, MoveElementPostcondition, Consumer<MoveElementPrecondition.Match>> moveElement = DifferenceFactory.<MoveElementPrecondition.Match, MoveElementPrecondition.Matcher, MoveElementPrecondition, MoveElementPostcondition.Match, MoveElementPostcondition.Matcher, MoveElementPostcondition, Consumer<MoveElementPrecondition.Match>>difference().name("Move Element").precondition(MoveElementPrecondition.instance()).action(
    ((Consumer<MoveElementPrecondition.Match>) (MoveElementPrecondition.Match it) -> {
      final SubProcess subProcess = Differences._bpmn2Factory.createSubProcess();
      subProcess.setName("Send Order");
      EList<FlowElement> _flowElements = subProcess.getFlowElements();
      EObject _current = it.getStartEvent().getCurrent();
      _flowElements.add(((StartEvent) _current));
      EList<FlowElement> _flowElements_1 = subProcess.getFlowElements();
      EObject _current_1 = it.getTask().getCurrent();
      _flowElements_1.add(((Task) _current_1));
      EList<FlowElement> _flowElements_2 = subProcess.getFlowElements();
      EObject _current_2 = it.getEndEvent().getCurrent();
      _flowElements_2.add(((EndEvent) _current_2));
      EList<FlowElement> _flowElements_3 = subProcess.getFlowElements();
      EObject _current_3 = it.getStartEventToTask().getCurrent();
      _flowElements_3.add(((SequenceFlow) _current_3));
      EList<FlowElement> _flowElements_4 = subProcess.getFlowElements();
      EObject _current_4 = it.getTaskToEndEvent().getCurrent();
      _flowElements_4.add(((SequenceFlow) _current_4));
      EObject _current_5 = it.getProcess().getCurrent();
      EList<FlowElement> _flowElements_5 = ((se.mdh.idt.benji.examples.metamodels.bpmn2.Process) _current_5).getFlowElements();
      _flowElements_5.add(subProcess);
    })).postcondition(MoveElementPostcondition.instance()).build();
  
  public static final Difference<RenameElementPrecondition.Match, RenameElementPrecondition.Matcher, RenameElementPrecondition, RenameElementPostcondition.Match, RenameElementPostcondition.Matcher, RenameElementPostcondition, Consumer<RenameElementPrecondition.Match>> renameElement = DifferenceFactory.<RenameElementPrecondition.Match, RenameElementPrecondition.Matcher, RenameElementPrecondition, RenameElementPostcondition.Match, RenameElementPostcondition.Matcher, RenameElementPostcondition, Consumer<RenameElementPrecondition.Match>>difference().name("Rename Element").precondition(RenameElementPrecondition.instance()).action(((Consumer<RenameElementPrecondition.Match>) (RenameElementPrecondition.Match it) -> {
    EObject _current = it.getTask().getCurrent();
    ((Task) _current).setName("Send Items");
  })).postcondition(RenameElementPostcondition.instance()).build();
  
  public static final Difference<MoveRenamedElementPrecondition.Match, MoveRenamedElementPrecondition.Matcher, MoveRenamedElementPrecondition, MoveRenamedElementPostcondition.Match, MoveRenamedElementPostcondition.Matcher, MoveRenamedElementPostcondition, Consumer<MoveRenamedElementPrecondition.Match>> moveRenamedElement = DifferenceFactory.<MoveRenamedElementPrecondition.Match, MoveRenamedElementPrecondition.Matcher, MoveRenamedElementPrecondition, MoveRenamedElementPostcondition.Match, MoveRenamedElementPostcondition.Matcher, MoveRenamedElementPostcondition, Consumer<MoveRenamedElementPrecondition.Match>>difference().name("Move Renamed Element").precondition(MoveRenamedElementPrecondition.instance()).action(
    ((Consumer<MoveRenamedElementPrecondition.Match>) (MoveRenamedElementPrecondition.Match it) -> {
      EObject _current = it.getTask().getCurrent();
      ((Task) _current).setName("Send Items");
      final SubProcess subProcess = Differences._bpmn2Factory.createSubProcess();
      subProcess.setName("Send Order");
      EList<FlowElement> _flowElements = subProcess.getFlowElements();
      EObject _current_1 = it.getStartEvent().getCurrent();
      _flowElements.add(((StartEvent) _current_1));
      EList<FlowElement> _flowElements_1 = subProcess.getFlowElements();
      EObject _current_2 = it.getTask().getCurrent();
      _flowElements_1.add(((Task) _current_2));
      EList<FlowElement> _flowElements_2 = subProcess.getFlowElements();
      EObject _current_3 = it.getEndEvent().getCurrent();
      _flowElements_2.add(((EndEvent) _current_3));
      EList<FlowElement> _flowElements_3 = subProcess.getFlowElements();
      EObject _current_4 = it.getStartEventToTask().getCurrent();
      _flowElements_3.add(((SequenceFlow) _current_4));
      EList<FlowElement> _flowElements_4 = subProcess.getFlowElements();
      EObject _current_5 = it.getTaskToEndEvent().getCurrent();
      _flowElements_4.add(((SequenceFlow) _current_5));
      EObject _current_6 = it.getProcess().getCurrent();
      EList<FlowElement> _flowElements_5 = ((se.mdh.idt.benji.examples.metamodels.bpmn2.Process) _current_6).getFlowElements();
      _flowElements_5.add(subProcess);
    })).postcondition(MoveRenamedElementPostcondition.instance()).build();
  
  public static final Difference<ExchangeLocationOfElementsPrecondition.Match, ExchangeLocationOfElementsPrecondition.Matcher, ExchangeLocationOfElementsPrecondition, ExchangeLocationOfElementsPostcondition.Match, ExchangeLocationOfElementsPostcondition.Matcher, ExchangeLocationOfElementsPostcondition, Consumer<ExchangeLocationOfElementsPrecondition.Match>> exchangeLocationOfElements = DifferenceFactory.<ExchangeLocationOfElementsPrecondition.Match, ExchangeLocationOfElementsPrecondition.Matcher, ExchangeLocationOfElementsPrecondition, ExchangeLocationOfElementsPostcondition.Match, ExchangeLocationOfElementsPostcondition.Matcher, ExchangeLocationOfElementsPostcondition, Consumer<ExchangeLocationOfElementsPrecondition.Match>>difference().name("Exchange Location of Elements").precondition(ExchangeLocationOfElementsPrecondition.instance()).action(
    ((Consumer<ExchangeLocationOfElementsPrecondition.Match>) (ExchangeLocationOfElementsPrecondition.Match it) -> {
      EObject _current = it.getLeftSubProcess().getCurrent();
      EList<FlowElement> _flowElements = ((SubProcess) _current).getFlowElements();
      EObject _current_1 = it.getRightTask().getCurrent();
      _flowElements.add(((Task) _current_1));
      EObject _current_2 = it.getRightSubProcess().getCurrent();
      EList<FlowElement> _flowElements_1 = ((SubProcess) _current_2).getFlowElements();
      EObject _current_3 = it.getLeftTask().getCurrent();
      _flowElements_1.add(((Task) _current_3));
    })).postcondition(ExchangeLocationOfElementsPostcondition.instance()).build();
  
  public static final Difference<UpdateReferenceTargetPrecondition.Match, UpdateReferenceTargetPrecondition.Matcher, UpdateReferenceTargetPrecondition, UpdateReferenceTargetPostcondition.Match, UpdateReferenceTargetPostcondition.Matcher, UpdateReferenceTargetPostcondition, Consumer<UpdateReferenceTargetPrecondition.Match>> updateReferenceTarget = DifferenceFactory.<UpdateReferenceTargetPrecondition.Match, UpdateReferenceTargetPrecondition.Matcher, UpdateReferenceTargetPrecondition, UpdateReferenceTargetPostcondition.Match, UpdateReferenceTargetPostcondition.Matcher, UpdateReferenceTargetPostcondition, Consumer<UpdateReferenceTargetPrecondition.Match>>difference().name("Update Reference Target").precondition(UpdateReferenceTargetPrecondition.instance()).action(
    ((Consumer<UpdateReferenceTargetPrecondition.Match>) (UpdateReferenceTargetPrecondition.Match it) -> {
      EObject _current = it.getSequenceFlow().getCurrent();
      EObject _current_1 = it.getTaskThree().getCurrent();
      ((SequenceFlow) _current).setTargetRef(((Task) _current_1));
    })).postcondition(UpdateReferenceTargetPostcondition.instance()).build();
}
