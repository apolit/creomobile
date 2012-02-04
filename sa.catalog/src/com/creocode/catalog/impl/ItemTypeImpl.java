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
import com.creocode.catalog.DetailsType;
import com.creocode.catalog.ItemType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.creocode.catalog.impl.ItemTypeImpl#getItemIdentifier <em>Item Identifier</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.ItemTypeImpl#getTemplateItem <em>Template Item</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.ItemTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.ItemTypeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.ItemTypeImpl#getIntro <em>Intro</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.ItemTypeImpl#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemTypeImpl extends EObjectImpl implements ItemType {
	/**
	 * The default value of the '{@link #getItemIdentifier() <em>Item Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemIdentifier() <em>Item Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String itemIdentifier = ITEM_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplateItem() <em>Template Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateItem()
	 * @generated
	 * @ordered
	 */
	protected EObject templateItem;

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
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntro() <em>Intro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntro()
	 * @generated
	 * @ordered
	 */
	protected static final String INTRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntro() <em>Intro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntro()
	 * @generated
	 * @ordered
	 */
	protected String intro = INTRO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected DetailsType details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemIdentifier() {
		return itemIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemIdentifier(String newItemIdentifier) {
		String oldItemIdentifier = itemIdentifier;
		itemIdentifier = newItemIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ITEM_TYPE__ITEM_IDENTIFIER, oldItemIdentifier, itemIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTemplateItem() {
		return templateItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateItem(EObject newTemplateItem) {
		EObject oldTemplateItem = templateItem;
		templateItem = newTemplateItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ITEM_TYPE__TEMPLATE_ITEM, oldTemplateItem, templateItem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ITEM_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ITEM_TYPE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntro() {
		return intro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntro(String newIntro) {
		String oldIntro = intro;
		intro = newIntro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ITEM_TYPE__INTRO, oldIntro, intro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailsType getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetails(DetailsType newDetails, NotificationChain msgs) {
		DetailsType oldDetails = details;
		details = newDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CatalogPackage.ITEM_TYPE__DETAILS, oldDetails, newDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(DetailsType newDetails) {
		if (newDetails != details) {
			NotificationChain msgs = null;
			if (details != null)
				msgs = ((InternalEObject)details).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CatalogPackage.ITEM_TYPE__DETAILS, null, msgs);
			if (newDetails != null)
				msgs = ((InternalEObject)newDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CatalogPackage.ITEM_TYPE__DETAILS, null, msgs);
			msgs = basicSetDetails(newDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ITEM_TYPE__DETAILS, newDetails, newDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.ITEM_TYPE__DETAILS:
				return basicSetDetails(null, msgs);
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
			case CatalogPackage.ITEM_TYPE__ITEM_IDENTIFIER:
				return getItemIdentifier();
			case CatalogPackage.ITEM_TYPE__TEMPLATE_ITEM:
				return getTemplateItem();
			case CatalogPackage.ITEM_TYPE__TITLE:
				return getTitle();
			case CatalogPackage.ITEM_TYPE__CONTENT:
				return getContent();
			case CatalogPackage.ITEM_TYPE__INTRO:
				return getIntro();
			case CatalogPackage.ITEM_TYPE__DETAILS:
				return getDetails();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogPackage.ITEM_TYPE__ITEM_IDENTIFIER:
				setItemIdentifier((String)newValue);
				return;
			case CatalogPackage.ITEM_TYPE__TEMPLATE_ITEM:
				setTemplateItem((EObject)newValue);
				return;
			case CatalogPackage.ITEM_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case CatalogPackage.ITEM_TYPE__CONTENT:
				setContent((String)newValue);
				return;
			case CatalogPackage.ITEM_TYPE__INTRO:
				setIntro((String)newValue);
				return;
			case CatalogPackage.ITEM_TYPE__DETAILS:
				setDetails((DetailsType)newValue);
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
			case CatalogPackage.ITEM_TYPE__ITEM_IDENTIFIER:
				setItemIdentifier(ITEM_IDENTIFIER_EDEFAULT);
				return;
			case CatalogPackage.ITEM_TYPE__TEMPLATE_ITEM:
				setTemplateItem((EObject)null);
				return;
			case CatalogPackage.ITEM_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CatalogPackage.ITEM_TYPE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CatalogPackage.ITEM_TYPE__INTRO:
				setIntro(INTRO_EDEFAULT);
				return;
			case CatalogPackage.ITEM_TYPE__DETAILS:
				setDetails((DetailsType)null);
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
			case CatalogPackage.ITEM_TYPE__ITEM_IDENTIFIER:
				return ITEM_IDENTIFIER_EDEFAULT == null ? itemIdentifier != null : !ITEM_IDENTIFIER_EDEFAULT.equals(itemIdentifier);
			case CatalogPackage.ITEM_TYPE__TEMPLATE_ITEM:
				return templateItem != null;
			case CatalogPackage.ITEM_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CatalogPackage.ITEM_TYPE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case CatalogPackage.ITEM_TYPE__INTRO:
				return INTRO_EDEFAULT == null ? intro != null : !INTRO_EDEFAULT.equals(intro);
			case CatalogPackage.ITEM_TYPE__DETAILS:
				return details != null;
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
		result.append(" (itemIdentifier: ");
		result.append(itemIdentifier);
		result.append(", title: ");
		result.append(title);
		result.append(", content: ");
		result.append(content);
		result.append(", intro: ");
		result.append(intro);
		result.append(')');
		return result.toString();
	}

} //ItemTypeImpl
