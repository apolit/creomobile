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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.creocode.catalog.CategoryType#getTitle <em>Title</em>}</li>
 *   <li>{@link com.creocode.catalog.CategoryType#getItem <em>Item</em>}</li>
 *   <li>{@link com.creocode.catalog.CategoryType#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link com.creocode.catalog.CategoryType#isSequence <em>Sequence</em>}</li>
 *   <li>{@link com.creocode.catalog.CategoryType#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.creocode.catalog.CatalogPackage#getCategoryType()
 * @model extendedMetaData="name='categoryType' kind='elementOnly'"
 * @generated
 */
public interface CategoryType extends EObject {
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
	 * @see com.creocode.catalog.CatalogPackage#getCategoryType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.creocode.catalog.CategoryType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link com.creocode.catalog.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see com.creocode.catalog.CatalogPackage#getCategoryType_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Sub Category</b></em>' containment reference list.
	 * The list contents are of type {@link com.creocode.catalog.CategoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Category</em>' containment reference list.
	 * @see com.creocode.catalog.CatalogPackage#getCategoryType_SubCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CategoryType> getSubCategory();

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #isSetSequence()
	 * @see #unsetSequence()
	 * @see #setSequence(boolean)
	 * @see com.creocode.catalog.CatalogPackage#getCategoryType_Sequence()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='sequence'"
	 * @generated
	 */
	boolean isSequence();

	/**
	 * Sets the value of the '{@link com.creocode.catalog.CategoryType#isSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #isSetSequence()
	 * @see #unsetSequence()
	 * @see #isSequence()
	 * @generated
	 */
	void setSequence(boolean value);

	/**
	 * Unsets the value of the '{@link com.creocode.catalog.CategoryType#isSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequence()
	 * @see #isSequence()
	 * @see #setSequence(boolean)
	 * @generated
	 */
	void unsetSequence();

	/**
	 * Returns whether the value of the '{@link com.creocode.catalog.CategoryType#isSequence <em>Sequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence</em>' attribute is set.
	 * @see #unsetSequence()
	 * @see #isSequence()
	 * @see #setSequence(boolean)
	 * @generated
	 */
	boolean isSetSequence();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.creocode.catalog.CatalogPackage#getCategoryType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.creocode.catalog.CategoryType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // CategoryType
