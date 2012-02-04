/*******************************************************************************
 * Copyright (c) 2010 Artur Polit, Szymon Ptaszkiewicz
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Szymon Ptaszkiewicz - initial code generation and customization
 *******************************************************************************/
package com.creocode.catalog.impl;

import com.creocode.catalog.CatalogPackage;
import com.creocode.catalog.CategoryType;
import com.creocode.catalog.ItemType;
import java.util.Collection;
import com.creocode.catalog.ItemsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.creocode.catalog.impl.CategoryTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CategoryTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CategoryTypeImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CategoryTypeImpl#isSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryTypeImpl extends EObjectImpl implements CategoryType {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> item;

	/**
	 * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryType> subCategory;

	/**
	 * The default value of the '{@link #isSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequence()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEQUENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequence()
	 * @generated
	 * @ordered
	 */
	protected boolean sequence = SEQUENCE_EDEFAULT;

	/**
	 * This is true if the Sequence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.CATEGORY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATEGORY_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, CatalogPackage.CATEGORY_TYPE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryType> getSubCategory() {
		if (subCategory == null) {
			subCategory = new EObjectContainmentEList<CategoryType>(CategoryType.class, this, CatalogPackage.CATEGORY_TYPE__SUB_CATEGORY);
		}
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(boolean newSequence) {
		boolean oldSequence = sequence;
		sequence = newSequence;
		boolean oldSequenceESet = sequenceESet;
		sequenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATEGORY_TYPE__SEQUENCE, oldSequence, sequence, !oldSequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSequence() {
		boolean oldSequence = sequence;
		boolean oldSequenceESet = sequenceESet;
		sequence = SEQUENCE_EDEFAULT;
		sequenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CatalogPackage.CATEGORY_TYPE__SEQUENCE, oldSequence, SEQUENCE_EDEFAULT, oldSequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSequence() {
		return sequenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.CATEGORY_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATEGORY_TYPE__SUB_CATEGORY:
				return ((InternalEList<?>)getSubCategory()).basicRemove(otherEnd, msgs);
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
			case CatalogPackage.CATEGORY_TYPE__TITLE:
				return getTitle();
			case CatalogPackage.CATEGORY_TYPE__ITEM:
				return getItem();
			case CatalogPackage.CATEGORY_TYPE__SUB_CATEGORY:
				return getSubCategory();
			case CatalogPackage.CATEGORY_TYPE__SEQUENCE:
				return isSequence();
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
			case CatalogPackage.CATEGORY_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case CatalogPackage.CATEGORY_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case CatalogPackage.CATEGORY_TYPE__SUB_CATEGORY:
				getSubCategory().clear();
				getSubCategory().addAll((Collection<? extends CategoryType>)newValue);
				return;
			case CatalogPackage.CATEGORY_TYPE__SEQUENCE:
				setSequence((Boolean)newValue);
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
			case CatalogPackage.CATEGORY_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CatalogPackage.CATEGORY_TYPE__ITEM:
				getItem().clear();
				return;
			case CatalogPackage.CATEGORY_TYPE__SUB_CATEGORY:
				getSubCategory().clear();
				return;
			case CatalogPackage.CATEGORY_TYPE__SEQUENCE:
				unsetSequence();
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
			case CatalogPackage.CATEGORY_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CatalogPackage.CATEGORY_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case CatalogPackage.CATEGORY_TYPE__SUB_CATEGORY:
				return subCategory != null && !subCategory.isEmpty();
			case CatalogPackage.CATEGORY_TYPE__SEQUENCE:
				return isSetSequence();
		}
		return super.eIsSet(featureID);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", sequence: ");
		if (sequenceESet) result.append(sequence); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CategoryTypeImpl
