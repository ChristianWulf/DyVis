/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package feature.statics.impl;

import feature.common.CodeElement;
import feature.common.CommonPackage;
import feature.common.IComponent;
import feature.common.IInfoElement;

import feature.statics.DClass;
import feature.statics.DPackage;
import feature.statics.StaticsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link feature.statics.impl.DPackageImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link feature.statics.impl.DPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link feature.statics.impl.DPackageImpl#getLine <em>Line</em>}</li>
 *   <li>{@link feature.statics.impl.DPackageImpl#getMetaphorObject <em>Metaphor Object</em>}</li>
 *   <li>{@link feature.statics.impl.DPackageImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link feature.statics.impl.DPackageImpl#getRowDescriptions <em>Row Descriptions</em>}</li>
 *   <li>{@link feature.statics.impl.DPackageImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link feature.statics.impl.DPackageImpl#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DPackageImpl extends EObjectImpl implements DPackage {
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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<IComponent> children;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticsPackage.Literals.DPACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DPACKAGE__FILENAME, oldFilename, filename));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DPACKAGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DPACKAGE__LINE, oldLine, line));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DPACKAGE__METAPHOR_OBJECT, oldMetaphorObject, metaphorObject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DPACKAGE__CONTENTS, oldContents, contents));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DPACKAGE__ROW_DESCRIPTIONS, oldRowDescriptions, rowDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IComponent> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<IComponent>(IComponent.class, this, StaticsPackage.DPACKAGE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticsPackage.DPACKAGE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticsPackage.DPACKAGE__FILENAME:
				return getFilename();
			case StaticsPackage.DPACKAGE__NAME:
				return getName();
			case StaticsPackage.DPACKAGE__LINE:
				return getLine();
			case StaticsPackage.DPACKAGE__METAPHOR_OBJECT:
				return getMetaphorObject();
			case StaticsPackage.DPACKAGE__CONTENTS:
				return getContents();
			case StaticsPackage.DPACKAGE__ROW_DESCRIPTIONS:
				return getRowDescriptions();
			case StaticsPackage.DPACKAGE__CHILDREN:
				return getChildren();
			case StaticsPackage.DPACKAGE__LEVEL:
				return getLevel();
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
			case StaticsPackage.DPACKAGE__FILENAME:
				setFilename((String)newValue);
				return;
			case StaticsPackage.DPACKAGE__NAME:
				setName((String)newValue);
				return;
			case StaticsPackage.DPACKAGE__LINE:
				setLine((Integer)newValue);
				return;
			case StaticsPackage.DPACKAGE__METAPHOR_OBJECT:
				setMetaphorObject(newValue);
				return;
			case StaticsPackage.DPACKAGE__CONTENTS:
				setContents((String[])newValue);
				return;
			case StaticsPackage.DPACKAGE__ROW_DESCRIPTIONS:
				setRowDescriptions((String[])newValue);
				return;
			case StaticsPackage.DPACKAGE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends IComponent>)newValue);
				return;
			case StaticsPackage.DPACKAGE__LEVEL:
				setLevel((Integer)newValue);
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
			case StaticsPackage.DPACKAGE__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case StaticsPackage.DPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticsPackage.DPACKAGE__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case StaticsPackage.DPACKAGE__METAPHOR_OBJECT:
				setMetaphorObject(METAPHOR_OBJECT_EDEFAULT);
				return;
			case StaticsPackage.DPACKAGE__CONTENTS:
				setContents(CONTENTS_EDEFAULT);
				return;
			case StaticsPackage.DPACKAGE__ROW_DESCRIPTIONS:
				setRowDescriptions(ROW_DESCRIPTIONS_EDEFAULT);
				return;
			case StaticsPackage.DPACKAGE__CHILDREN:
				getChildren().clear();
				return;
			case StaticsPackage.DPACKAGE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case StaticsPackage.DPACKAGE__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case StaticsPackage.DPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticsPackage.DPACKAGE__LINE:
				return line != LINE_EDEFAULT;
			case StaticsPackage.DPACKAGE__METAPHOR_OBJECT:
				return METAPHOR_OBJECT_EDEFAULT == null ? metaphorObject != null : !METAPHOR_OBJECT_EDEFAULT.equals(metaphorObject);
			case StaticsPackage.DPACKAGE__CONTENTS:
				return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
			case StaticsPackage.DPACKAGE__ROW_DESCRIPTIONS:
				return ROW_DESCRIPTIONS_EDEFAULT == null ? rowDescriptions != null : !ROW_DESCRIPTIONS_EDEFAULT.equals(rowDescriptions);
			case StaticsPackage.DPACKAGE__CHILDREN:
				return children != null && !children.isEmpty();
			case StaticsPackage.DPACKAGE__LEVEL:
				return level != LEVEL_EDEFAULT;
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
				case StaticsPackage.DPACKAGE__FILENAME: return CommonPackage.CODE_ELEMENT__FILENAME;
				case StaticsPackage.DPACKAGE__NAME: return CommonPackage.CODE_ELEMENT__NAME;
				case StaticsPackage.DPACKAGE__LINE: return CommonPackage.CODE_ELEMENT__LINE;
				default: return -1;
			}
		}
		if (baseClass == IInfoElement.class) {
			switch (derivedFeatureID) {
				case StaticsPackage.DPACKAGE__METAPHOR_OBJECT: return CommonPackage.IINFO_ELEMENT__METAPHOR_OBJECT;
				case StaticsPackage.DPACKAGE__CONTENTS: return CommonPackage.IINFO_ELEMENT__CONTENTS;
				case StaticsPackage.DPACKAGE__ROW_DESCRIPTIONS: return CommonPackage.IINFO_ELEMENT__ROW_DESCRIPTIONS;
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
				case CommonPackage.CODE_ELEMENT__FILENAME: return StaticsPackage.DPACKAGE__FILENAME;
				case CommonPackage.CODE_ELEMENT__NAME: return StaticsPackage.DPACKAGE__NAME;
				case CommonPackage.CODE_ELEMENT__LINE: return StaticsPackage.DPACKAGE__LINE;
				default: return -1;
			}
		}
		if (baseClass == IInfoElement.class) {
			switch (baseFeatureID) {
				case CommonPackage.IINFO_ELEMENT__METAPHOR_OBJECT: return StaticsPackage.DPACKAGE__METAPHOR_OBJECT;
				case CommonPackage.IINFO_ELEMENT__CONTENTS: return StaticsPackage.DPACKAGE__CONTENTS;
				case CommonPackage.IINFO_ELEMENT__ROW_DESCRIPTIONS: return StaticsPackage.DPACKAGE__ROW_DESCRIPTIONS;
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
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //DPackageImpl
