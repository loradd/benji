/**
 */
package se.mdh.idt.benji.trace.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import se.mdh.idt.benji.trace.TraceLink;
import se.mdh.idt.benji.trace.TraceModel;
import se.mdh.idt.benji.trace.TracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link se.mdh.idt.benji.trace.impl.TraceLinkImpl#getTraceModel <em>Trace
 * Model</em>}</li>
 * <li>{@link se.mdh.idt.benji.trace.impl.TraceLinkImpl#getSource
 * <em>Source</em>}</li>
 * <li>{@link se.mdh.idt.benji.trace.impl.TraceLinkImpl#getTarget
 * <em>Target</em>}</li>
 * <li>{@link se.mdh.idt.benji.trace.impl.TraceLinkImpl#getIdentifier
 * <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceLinkImpl extends MinimalEObjectImpl.Container implements TraceLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EObject source;
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected final String IDENTIFIER_EDEFAULT = UUID.randomUUID().toString();
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TraceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACE_LINK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TraceModel getTraceModel() {
		if (eContainerFeatureID() != TracePackage.TRACE_LINK__TRACE_MODEL)
			return null;
		return (TraceModel) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TraceModel basicGetTraceModel() {
		if (eContainerFeatureID() != TracePackage.TRACE_LINK__TRACE_MODEL)
			return null;
		return (TraceModel) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTraceModel(TraceModel newTraceModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTraceModel, TracePackage.TRACE_LINK__TRACE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTraceModel(TraceModel newTraceModel) {
		if (newTraceModel != eInternalContainer()
				|| (eContainerFeatureID() != TracePackage.TRACE_LINK__TRACE_MODEL && newTraceModel != null)) {
			if (EcoreUtil.isAncestor(this, newTraceModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTraceModel != null)
				msgs = ((InternalEObject) newTraceModel).eInverseAdd(this, TracePackage.TRACE_MODEL__TRACE_LINKS,
						TraceModel.class, msgs);
			msgs = basicSetTraceModel(newTraceModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE_LINK__TRACE_MODEL, newTraceModel,
					newTraceModel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TRACE_LINK__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSource(EObject newSource) {
		EObject oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TRACE_LINK__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTarget(EObject newTarget) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE_LINK__IDENTIFIER, oldIdentifier,
					identifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public <T extends EObject> T source() {
		EObject _source = this.getSource();
		return (T) _source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public <T extends EObject> T target() {
		EObject _target = this.getTarget();
		return (T) _target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracePackage.TRACE_LINK__TRACE_MODEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTraceModel((TraceModel) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracePackage.TRACE_LINK__TRACE_MODEL:
			return basicSetTraceModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TracePackage.TRACE_LINK__TRACE_MODEL:
			return eInternalContainer().eInverseRemove(this, TracePackage.TRACE_MODEL__TRACE_LINKS, TraceModel.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TracePackage.TRACE_LINK__TRACE_MODEL:
			if (resolve)
				return getTraceModel();
			return basicGetTraceModel();
		case TracePackage.TRACE_LINK__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case TracePackage.TRACE_LINK__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case TracePackage.TRACE_LINK__IDENTIFIER:
			return getIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TracePackage.TRACE_LINK__TRACE_MODEL:
			setTraceModel((TraceModel) newValue);
			return;
		case TracePackage.TRACE_LINK__SOURCE:
			setSource((EObject) newValue);
			return;
		case TracePackage.TRACE_LINK__TARGET:
			setTarget((EObject) newValue);
			return;
		case TracePackage.TRACE_LINK__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TracePackage.TRACE_LINK__TRACE_MODEL:
			setTraceModel((TraceModel) null);
			return;
		case TracePackage.TRACE_LINK__SOURCE:
			setSource((EObject) null);
			return;
		case TracePackage.TRACE_LINK__TARGET:
			setTarget((EObject) null);
			return;
		case TracePackage.TRACE_LINK__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TracePackage.TRACE_LINK__TRACE_MODEL:
			return basicGetTraceModel() != null;
		case TracePackage.TRACE_LINK__SOURCE:
			return source != null;
		case TracePackage.TRACE_LINK__TARGET:
			return target != null;
		case TracePackage.TRACE_LINK__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TracePackage.TRACE_LINK___SOURCE:
			return source();
		case TracePackage.TRACE_LINK___TARGET:
			return target();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} // TraceLinkImpl
