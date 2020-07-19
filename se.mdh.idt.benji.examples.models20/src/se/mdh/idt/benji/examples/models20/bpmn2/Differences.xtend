package se.mdh.idt.benji.examples.models20.bpmn2

import se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Factory
import se.mdh.idt.benji.examples.metamodels.bpmn2.EndEvent
import se.mdh.idt.benji.examples.metamodels.bpmn2.Process
import se.mdh.idt.benji.examples.metamodels.bpmn2.SequenceFlow
import se.mdh.idt.benji.examples.metamodels.bpmn2.StartEvent
import se.mdh.idt.benji.examples.metamodels.bpmn2.SubProcess
import se.mdh.idt.benji.examples.metamodels.bpmn2.Task

import static se.mdh.idt.benji.difference.api.DifferenceFactory.difference

class Differences {
	
	static extension Bpmn2Factory = Bpmn2Factory.eINSTANCE

	public static val moveElement = difference
		.name("Move Element")
		.precondition(MoveElementPrecondition.instance)
		.action[
			val subProcess = createSubProcess
			subProcess.name = "Send Order"
			subProcess.flowElements += startEvent.current as StartEvent
			subProcess.flowElements += task.current as Task
			subProcess.flowElements += endEvent.current as EndEvent
			subProcess.flowElements += startEventToTask.current as SequenceFlow
			subProcess.flowElements += taskToEndEvent.current as SequenceFlow
			(process.current as Process).flowElements += subProcess
		]
		.postcondition(MoveElementPostcondition.instance)
		.build

	public static val renameElement = difference
		.name("Rename Element")
		.precondition(RenameElementPrecondition.instance)
		.action[ (task.current as Task).name = "Send Items" ]
		.postcondition(RenameElementPostcondition.instance)
		.build
	
	public static val moveRenamedElement = difference
		.name("Move Renamed Element")
		.precondition(MoveRenamedElementPrecondition.instance)
		.action[
			(task.current as Task).name = "Send Items"
			val subProcess = createSubProcess
			subProcess.name = "Send Order"
			subProcess.flowElements += startEvent.current as StartEvent
			subProcess.flowElements += task.current as Task
			subProcess.flowElements += endEvent.current as EndEvent
			subProcess.flowElements += startEventToTask.current as SequenceFlow
			subProcess.flowElements += taskToEndEvent.current as SequenceFlow
			(process.current as Process).flowElements += subProcess
		]
		.postcondition(MoveRenamedElementPostcondition.instance)
		.build
	
	public static val exchangeLocationOfElements = difference
		.name("Exchange Location of Elements")
		.precondition(ExchangeLocationOfElementsPrecondition.instance)
		.action[
			(leftSubProcess.current as SubProcess).flowElements += rightTask.current as Task
			(rightSubProcess.current as SubProcess).flowElements += leftTask.current as Task
		]
		.postcondition(ExchangeLocationOfElementsPostcondition.instance)
		.build
	
	public static val updateReferenceTarget = difference
		.name("Update Reference Target")
		.precondition(UpdateReferenceTargetPrecondition.instance)
		.action[
			(sequenceFlow.current as SequenceFlow).targetRef = taskThree.current as Task
		]
		.postcondition(UpdateReferenceTargetPostcondition.instance)
		.build	
		
}




