/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics.impl;

import feature.common.CodeElement;
import feature.common.CommonPackage;
import feature.common.IInfoElement;

import feature.dynamics.DClassInstance;
import feature.dynamics.DynamicsPackage;

import feature.metrics.IStaticsMetric;
import feature.metrics.MetricsPackage;
import feature.metrics.NOAMetric;
import feature.metrics.NOMMetric;

import feature.statics.DAttribute;
import feature.statics.DClass;
import feature.statics.DMethod;
import feature.statics.StaticsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link feature.statics.impl.DClassImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getLine <em>Line</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getMetaphorObject <em>Metaphor Object</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getRowDescriptions <em>Row Descriptions</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getNoa <em>Noa</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link feature.statics.impl.DClassImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DClassImpl extends EObjectImpl implements DClass {
	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaphorObject() <em>Metaphor Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaphorObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object METAPHOR_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaphorObject() <em>Metaphor Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaphorObject()
	 * @generated
	 * @ordered
	 */
	protected Object metaphorObject = METAPHOR_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected static final String[] CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected String[] contents = CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowDescriptions() <em>Row Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final String[] ROW_DESCRIPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowDescriptions() <em>Row Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowDescriptions()
	 * @generated
	 * @ordered
	 */
	protected String[] rowDescriptions = ROW_DESCRIPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final int NOM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected int nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoa() <em>Noa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoa()
	 * @generated
	 * @ordered
	 */
	protected static final int NOA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoa() <em>Noa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoa()
	 * @generated
	 * @ordered
	 */
	protected int noa = NOA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DClassInstance> instances;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DAttribute> attributes;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<DMethod> methods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticsPackage.Literals.DCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DCLASS__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DCLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DCLASS__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMetaphorObject() {
		return metaphorObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaphorObject(Object newMetaphorObject) {
		Object oldMetaphorObject = metaphorObject;
		metaphorObject = newMetaphorObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DCLASS__METAPHOR_OBJECT, oldMetaphorObject, metaphorObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContents(String[] newContents) {
		String[] oldContents = contents;
		contents = newContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DCLASS__CONTENTS, oldContents, contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getRowDescriptions() {
		return rowDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowDescriptions(String[] newRowDescriptions) {
		String[] oldRowDescriptions = rowDescriptions;
		rowDescriptions = newRowDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DCLASS__ROW_DESCRIPTIONS, oldRowDescriptions, rowDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(int newNom) {
		int oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DCLASS__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoa() {
		return noa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoa(int newNoa) {
		int oldNoa = noa;
		noa = newNoa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DCLASS__NOA, oldNoa, noa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DClassInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<DClassInstance>(DClassInstance.class, this, StaticsPackage.DCLASS__INSTANCES, DynamicsPackage.DCLASS_INSTANCE__PARENT);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<DAttribute>(DAttribute.class, this, StaticsPackage.DCLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectWithInverseResolvingEList<DMethod>(DMethod.class, this, StaticsPackage.DCLASS__METHODS, StaticsPackage.DMETHOD__PARENT);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticsPackage.DCLASS__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
			case StaticsPackage.DCLASS__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticsPackage.DCLASS__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case StaticsPackage.DCLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticsPackage.DCLASS__FILENAME:
				return getFilename();
			case StaticsPackage.DCLASS__NAME:
				return getName();
			case StaticsPackage.DCLASS__LINE:
				return getLine();
			case StaticsPackage.DCLASS__METAPHOR_OBJECT:
				return getMetaphorObject();
			case StaticsPackage.DCLASS__CONTENTS:
				return getContents();
			case StaticsPackage.DCLASS__ROW_DESCRIPTIONS:
				return getRowDescriptions();
			case StaticsPackage.DCLASS__NOM:
				return getNom();
			case StaticsPackage.DCLASS__NOA:
				return getNoa();
			case StaticsPackage.DCLASS__INSTANCES:
				return getInstances();
			case StaticsPackage.DCLASS__ATTRIBUTES:
				return getAttributes();
			case StaticsPackage.DCLASS__METHODS:
				return getMethods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StaticsPackage.DCLASS__FILENAME:
				setFilename((String)newValue);
				return;
			case StaticsPackage.DCLASS__NAME:
				setName((String)newValue);
				return;
			case StaticsPackage.DCLASS__LINE:
				setLine((Integer)newValue);
				return;
			case StaticsPackage.DCLASS__METAPHOR_OBJECT:
				setMetaphorObject(newValue);
				return;
			case StaticsPackage.DCLASS__CONTENTS:
				setContents((String[])newValue);
				return;
			case StaticsPackage.DCLASS__ROW_DESCRIPTIONS:
				setRowDescriptions((String[])newValue);
				return;
			case StaticsPackage.DCLASS__NOM:
				setNom((Integer)newValue);
				return;
			case StaticsPackage.DCLASS__NOA:
				setNoa((Integer)newValue);
				return;
			case StaticsPackage.DCLASS__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends DClassInstance>)newValue);
				return;
			case StaticsPackage.DCLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DAttribute>)newValue);
				return;
			case StaticsPackage.DCLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends DMethod>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StaticsPackage.DCLASS__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case StaticsPackage.DCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticsPackage.DCLASS__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case StaticsPackage.DCLASS__METAPHOR_OBJECT:
				setMetaphorObject(METAPHOR_OBJECT_EDEFAULT);
				return;
			case StaticsPackage.DCLASS__CONTENTS:
				setContents(CONTENTS_EDEFAULT);
				return;
			case StaticsPackage.DCLASS__ROW_DESCRIPTIONS:
				setRowDescriptions(ROW_DESCRIPTIONS_EDEFAULT);
				return;
			case StaticsPackage.DCLASS__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case StaticsPackage.DCLASS__NOA:
				setNoa(NOA_EDEFAULT);
				return;
			case StaticsPackage.DCLASS__INSTANCES:
				getInstances().clear();
				return;
			case StaticsPackage.DCLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case StaticsPackage.DCLASS__METHODS:
				getMethods().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StaticsPackage.DCLASS__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case StaticsPackage.DCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticsPackage.DCLASS__LINE:
				return line != LINE_EDEFAULT;
			case StaticsPackage.DCLASS__METAPHOR_OBJECT:
				return METAPHOR_OBJECT_EDEFAULT == null ? metaphorObject != null : !METAPHOR_OBJECT_EDEFAULT.equals(metaphorObject);
			case StaticsPackage.DCLASS__CONTENTS:
				return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
			case StaticsPackage.DCLASS__ROW_DESCRIPTIONS:
				return ROW_DESCRIPTIONS_EDEFAULT == null ? rowDescriptions != null : !ROW_DESCRIPTIONS_EDEFAULT.equals(rowDescriptions);
			case StaticsPackage.DCLASS__NOM:
				return nom != NOM_EDEFAULT;
			case StaticsPackage.DCLASS__NOA:
				return noa != NOA_EDEFAULT;
			case StaticsPackage.DCLASS__INSTANCES:
				return instances != null && !instances.isEmpty();
			case StaticsPackage.DCLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case StaticsPackage.DCLASS__METHODS:
				return methods != null && !methods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CodeElement.class) {
			switch (derivedFeatureID) {
				case StaticsPackage.DCLASS__FILENAME: return CommonPackage.CODE_ELEMENT__FILENAME;
				case StaticsPackage.DCLASS__NAME: return CommonPackage.CODE_ELEMENT__NAME;
				case StaticsPackage.DCLASS__LINE: return CommonPackage.CODE_ELEMENT__LINE;
				default: return -1;
			}
		}
		if (baseClass == IInfoElement.class) {
			switch (derivedFeatureID) {
				case StaticsPackage.DCLASS__METAPHOR_OBJECT: return CommonPackage.IINFO_ELEMENT__METAPHOR_OBJECT;
				case StaticsPackage.DCLASS__CONTENTS: return CommonPackage.IINFO_ELEMENT__CONTENTS;
				case StaticsPackage.DCLASS__ROW_DESCRIPTIONS: return CommonPackage.IINFO_ELEMENT__ROW_DESCRIPTIONS;
				default: return -1;
			}
		}
		if (baseClass == IStaticsMetric.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NOMMetric.class) {
			switch (derivedFeatureID) {
				case StaticsPackage.DCLASS__NOM: return MetricsPackage.NOM_METRIC__NOM;
				default: return -1;
			}
		}
		if (baseClass == NOAMetric.class) {
			switch (derivedFeatureID) {
				case StaticsPackage.DCLASS__NOA: return MetricsPackage.NOA_METRIC__NOA;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CodeElement.class) {
			switch (baseFeatureID) {
				case CommonPackage.CODE_ELEMENT__FILENAME: return StaticsPackage.DCLASS__FILENAME;
				case CommonPackage.CODE_ELEMENT__NAME: return StaticsPackage.DCLASS__NAME;
				case CommonPackage.CODE_ELEMENT__LINE: return StaticsPackage.DCLASS__LINE;
				default: return -1;
			}
		}
		if (baseClass == IInfoElement.class) {
			switch (baseFeatureID) {
				case CommonPackage.IINFO_ELEMENT__METAPHOR_OBJECT: return StaticsPackage.DCLASS__METAPHOR_OBJECT;
				case CommonPackage.IINFO_ELEMENT__CONTENTS: return StaticsPackage.DCLASS__CONTENTS;
				case CommonPackage.IINFO_ELEMENT__ROW_DESCRIPTIONS: return StaticsPackage.DCLASS__ROW_DESCRIPTIONS;
				default: return -1;
			}
		}
		if (baseClass == IStaticsMetric.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NOMMetric.class) {
			switch (baseFeatureID) {
				case MetricsPackage.NOM_METRIC__NOM: return StaticsPackage.DCLASS__NOM;
				default: return -1;
			}
		}
		if (baseClass == NOAMetric.class) {
			switch (baseFeatureID) {
				case MetricsPackage.NOA_METRIC__NOA: return StaticsPackage.DCLASS__NOA;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (filename: ");
		result.append(filename);
		result.append(", name: ");
		result.append(name);
		result.append(", line: ");
		result.append(line);
		result.append(", metaphorObject: ");
		result.append(metaphorObject);
		result.append(", contents: ");
		result.append(contents);
		result.append(", rowDescriptions: ");
		result.append(rowDescriptions);
		result.append(", nom: ");
		result.append(nom);
		result.append(", noa: ");
		result.append(noa);
		result.append(')');
		return result.toString();
	}

} //DClassImpl
