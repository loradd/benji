/**
 */
package se.mdh.idt.benji.examples.metamodels.bpmn2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Factory;
import se.mdh.idt.benji.examples.metamodels.bpmn2.Bpmn2Package;
import se.mdh.idt.benji.examples.metamodels.bpmn2.EndEvent;
import se.mdh.idt.benji.examples.metamodels.bpmn2.SequenceFlow;
import se.mdh.idt.benji.examples.metamodels.bpmn2.StartEvent;
import se.mdh.idt.benji.examples.metamodels.bpmn2.SubProcess;
import se.mdh.idt.benji.examples.metamodels.bpmn2.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bpmn2FactoryImpl extends EFactoryImpl implements Bpmn2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bpmn2Factory init() {
		try {
			Bpmn2Factory theBpmn2Factory = (Bpmn2Factory)EPackage.Registry.INSTANCE.getEFactory(Bpmn2Package.eNS_URI);
			if (theBpmn2Factory != null) {
				return theBpmn2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bpmn2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Bpmn2Package.PROCESS: return createProcess();
			case Bpmn2Package.SEQUENCE_FLOW: return createSequenceFlow();
			case Bpmn2Package.START_EVENT: return createStartEvent();
			case Bpmn2Package.END_EVENT: return createEndEvent();
			case Bpmn2Package.TASK: return createTask();
			case Bpmn2Package.SUB_PROCESS: return createSubProcess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public se.mdh.idt.benji.examples.metamodels.bpmn2.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubProcess createSubProcess() {
		SubProcessImpl subProcess = new SubProcessImpl();
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bpmn2Package getBpmn2Package() {
		return (Bpmn2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bpmn2Package getPackage() {
		return Bpmn2Package.eINSTANCE;
	}

} //Bpmn2FactoryImpl
