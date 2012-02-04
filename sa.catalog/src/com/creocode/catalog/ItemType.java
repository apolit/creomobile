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
package com.creocode.catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.creocode.catalog.ItemType#getItemIdentifier <em>Item Identifier</em>}</li>
 *   <li>{@link com.creocode.catalog.ItemType#getTemplateItem <em>Template Item</em>}</li>
 *   <li>{@link com.creocode.catalog.ItemType#getTitle <em>Title</em>}</li>
 *   <li>{@link com.creocode.catalog.ItemType#getContent <em>Content</em>}</li>
 *   <li>{@link com.creocode.catalog.ItemType#getIntro <em>Intro</em>}</li>
 *   <li>{@link com.creocode.catalog.ItemType#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.creocode.catalog.CatalogPackage#getItemType()
 * @model extendedMetaData="name='itemType' kind='elementOnly'"
 * @generated
 */
public interface ItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Identifier</em>' attribute.
	 * @see #setItemIdentifier(String)
	 * @see com.creocode.catalog.CatalogPackage#getItemType_ItemIdentifier()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='itemIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getItemIdentifier();

	/**
	 * Sets the value of the '{@link com.creocode.catalog.ItemType#getItemIdentifier <em>Item Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Identifier</em>' attribute.
	 * @see #getItemIdentifier()
	 * @generated
	 */
	void setItemIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Template Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Item</em>' reference.
	 * @see #setTemplateItem(EObject)
	 * @see com.creocode.catalog.CatalogPackage#getItemType_TemplateItem()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='templateItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTemplateItem();

	/**
	 * Sets the value of the '{@link com.creocode.catalog.ItemType#getTemplateItem <em>Template Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Item</em>' reference.
	 * @see #getTemplateItem()
	 * @generated
	 */
	void setTemplateItem(EObject value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.creocode.catalog.CatalogPackage#getItemType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.creocode.catalog.ItemType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see com.creocode.catalog.CatalogPackage#getItemType_Content()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link com.creocode.catalog.ItemType#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Intro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intro</em>' attribute.
	 * @see #setIntro(String)
	 * @see com.creocode.catalog.CatalogPackage#getItemType_Intro()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='intro' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIntro();

	/**
	 * Sets the value of the '{@link com.creocode.catalog.ItemType#getIntro <em>Intro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intro</em>' attribute.
	 * @see #getIntro()
	 * @generated
	 */
	void setIntro(String value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' containment reference.
	 * @see #setDetails(DetailsType)
	 * @see com.creocode.catalog.CatalogPackage#getItemType_Details()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='details' namespace='##targetNamespace'"
	 * @generated
	 */
	DetailsType getDetails();

	/**
	 * Sets the value of the '{@link com.creocode.catalog.ItemType#getDetails <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' containment reference.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(DetailsType value);

} // ItemType
