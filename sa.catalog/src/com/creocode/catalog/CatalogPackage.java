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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.creocode.catalog.CatalogFactory
 * @model kind="package"
 * @generated
 */
public interface CatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.creocode.com/catalog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogPackage eINSTANCE = com.creocode.catalog.impl.CatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.creocode.catalog.impl.CatalogTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.creocode.catalog.impl.CatalogTypeImpl
	 * @see com.creocode.catalog.impl.CatalogPackageImpl#getCatalogType()
	 * @generated
	 */
	int CATALOG_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Template Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__TEMPLATE_ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Copyrights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__COPYRIGHTS = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__ICON = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__VENDOR = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__VERSION = 9;

	/**
	 * The feature id for the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE__VERSION_CODE = 10;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.creocode.catalog.impl.CategoryTypeImpl <em>Category Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.creocode.catalog.impl.CategoryTypeImpl
	 * @see com.creocode.catalog.impl.CatalogPackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__ITEM = 1;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__SUB_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__SEQUENCE = 3;

	/**
	 * The number of structural features of the '<em>Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.creocode.catalog.impl.DetailsTypeImpl <em>Details Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.creocode.catalog.impl.DetailsTypeImpl
	 * @see com.creocode.catalog.impl.CatalogPackageImpl#getDetailsType()
	 * @generated
	 */
	int DETAILS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_TYPE__DETAIL = 0;

	/**
	 * The number of structural features of the '<em>Details Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.creocode.catalog.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.creocode.catalog.impl.DocumentRootImpl
	 * @see com.creocode.catalog.impl.CatalogPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOG = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.creocode.catalog.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.creocode.catalog.impl.ItemTypeImpl
	 * @see com.creocode.catalog.impl.CatalogPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Item Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__ITEM_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Template Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__TEMPLATE_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Intro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__INTRO = 4;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__DETAILS = 5;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link com.creocode.catalog.CatalogType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.creocode.catalog.CatalogType
	 * @generated
	 */
	EClass getCatalogType();

	/**
	 * Returns the meta object for the containment reference '{@link com.creocode.catalog.CatalogType#getTemplateItems <em>Template Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Items</em>'.
	 * @see com.creocode.catalog.CatalogType#getTemplateItems()
	 * @see #getCatalogType()
	 * @generated
	 */
	EReference getCatalogType_TemplateItems();

	/**
	 * Returns the meta object for the containment reference list '{@link com.creocode.catalog.CatalogType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see com.creocode.catalog.CatalogType#getCategory()
	 * @see #getCatalogType()
	 * @generated
	 */
	EReference getCatalogType_Category();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CatalogType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.creocode.catalog.CatalogType#getTitle()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CatalogType#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see com.creocode.catalog.CatalogType#getVendor()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CatalogType#getCopyrights <em>Copyrights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyrights</em>'.
	 * @see com.creocode.catalog.CatalogType#getCopyrights()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Copyrights();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CatalogType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see com.creocode.catalog.CatalogType#getAuthor()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Author();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CatalogType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.creocode.catalog.CatalogType#getVersion()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CatalogType#getVersionCode <em>Version Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Code</em>'.
	 * @see com.creocode.catalog.CatalogType#getVersionCode()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_VersionCode();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CatalogType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see com.creocode.catalog.CatalogType#getIcon()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CatalogType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.creocode.catalog.CatalogType#getId()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CatalogType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see com.creocode.catalog.CatalogType#getLanguage()
	 * @see #getCatalogType()
	 * @generated
	 */
	EAttribute getCatalogType_Language();

	/**
	 * Returns the meta object for class '{@link com.creocode.catalog.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Type</em>'.
	 * @see com.creocode.catalog.CategoryType
	 * @generated
	 */
	EClass getCategoryType();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CategoryType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.creocode.catalog.CategoryType#getTitle()
	 * @see #getCategoryType()
	 * @generated
	 */
	EAttribute getCategoryType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link com.creocode.catalog.CategoryType#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see com.creocode.catalog.CategoryType#getItem()
	 * @see #getCategoryType()
	 * @generated
	 */
	EReference getCategoryType_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link com.creocode.catalog.CategoryType#getSubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Category</em>'.
	 * @see com.creocode.catalog.CategoryType#getSubCategory()
	 * @see #getCategoryType()
	 * @generated
	 */
	EReference getCategoryType_SubCategory();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.CategoryType#isSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see com.creocode.catalog.CategoryType#isSequence()
	 * @see #getCategoryType()
	 * @generated
	 */
	EAttribute getCategoryType_Sequence();

	/**
	 * Returns the meta object for class '{@link com.creocode.catalog.DetailsType <em>Details Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Type</em>'.
	 * @see com.creocode.catalog.DetailsType
	 * @generated
	 */
	EClass getDetailsType();

	/**
	 * Returns the meta object for the attribute list '{@link com.creocode.catalog.DetailsType#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Detail</em>'.
	 * @see com.creocode.catalog.DetailsType#getDetail()
	 * @see #getDetailsType()
	 * @generated
	 */
	EAttribute getDetailsType_Detail();

	/**
	 * Returns the meta object for class '{@link com.creocode.catalog.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.creocode.catalog.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.creocode.catalog.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.creocode.catalog.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.creocode.catalog.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.creocode.catalog.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.creocode.catalog.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.creocode.catalog.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.creocode.catalog.DocumentRoot#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see com.creocode.catalog.DocumentRoot#getCatalog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Catalog();

	/**
	 * Returns the meta object for class '{@link com.creocode.catalog.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see com.creocode.catalog.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.ItemType#getItemIdentifier <em>Item Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Identifier</em>'.
	 * @see com.creocode.catalog.ItemType#getItemIdentifier()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_ItemIdentifier();

	/**
	 * Returns the meta object for the reference '{@link com.creocode.catalog.ItemType#getTemplateItem <em>Template Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template Item</em>'.
	 * @see com.creocode.catalog.ItemType#getTemplateItem()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_TemplateItem();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.ItemType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.creocode.catalog.ItemType#getTitle()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.ItemType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see com.creocode.catalog.ItemType#getContent()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Content();

	/**
	 * Returns the meta object for the attribute '{@link com.creocode.catalog.ItemType#getIntro <em>Intro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intro</em>'.
	 * @see com.creocode.catalog.ItemType#getIntro()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Intro();

	/**
	 * Returns the meta object for the containment reference '{@link com.creocode.catalog.ItemType#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Details</em>'.
	 * @see com.creocode.catalog.ItemType#getDetails()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Details();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogFactory getCatalogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.creocode.catalog.impl.CatalogTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.creocode.catalog.impl.CatalogTypeImpl
		 * @see com.creocode.catalog.impl.CatalogPackageImpl#getCatalogType()
		 * @generated
		 */
		EClass CATALOG_TYPE = eINSTANCE.getCatalogType();

		/**
		 * The meta object literal for the '<em><b>Template Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE__TEMPLATE_ITEMS = eINSTANCE.getCatalogType_TemplateItems();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_TYPE__CATEGORY = eINSTANCE.getCatalogType_Category();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__TITLE = eINSTANCE.getCatalogType_Title();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__VENDOR = eINSTANCE.getCatalogType_Vendor();

		/**
		 * The meta object literal for the '<em><b>Copyrights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__COPYRIGHTS = eINSTANCE.getCatalogType_Copyrights();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__AUTHOR = eINSTANCE.getCatalogType_Author();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__VERSION = eINSTANCE.getCatalogType_Version();

		/**
		 * The meta object literal for the '<em><b>Version Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__VERSION_CODE = eINSTANCE.getCatalogType_VersionCode();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__ICON = eINSTANCE.getCatalogType_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__ID = eINSTANCE.getCatalogType_Id();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_TYPE__LANGUAGE = eINSTANCE.getCatalogType_Language();

		/**
		 * The meta object literal for the '{@link com.creocode.catalog.impl.CategoryTypeImpl <em>Category Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.creocode.catalog.impl.CategoryTypeImpl
		 * @see com.creocode.catalog.impl.CatalogPackageImpl#getCategoryType()
		 * @generated
		 */
		EClass CATEGORY_TYPE = eINSTANCE.getCategoryType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_TYPE__TITLE = eINSTANCE.getCategoryType_Title();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_TYPE__ITEM = eINSTANCE.getCategoryType_Item();

		/**
		 * The meta object literal for the '<em><b>Sub Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_TYPE__SUB_CATEGORY = eINSTANCE.getCategoryType_SubCategory();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_TYPE__SEQUENCE = eINSTANCE.getCategoryType_Sequence();

		/**
		 * The meta object literal for the '{@link com.creocode.catalog.impl.DetailsTypeImpl <em>Details Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.creocode.catalog.impl.DetailsTypeImpl
		 * @see com.creocode.catalog.impl.CatalogPackageImpl#getDetailsType()
		 * @generated
		 */
		EClass DETAILS_TYPE = eINSTANCE.getDetailsType();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_TYPE__DETAIL = eINSTANCE.getDetailsType_Detail();

		/**
		 * The meta object literal for the '{@link com.creocode.catalog.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.creocode.catalog.impl.DocumentRootImpl
		 * @see com.creocode.catalog.impl.CatalogPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CATALOG = eINSTANCE.getDocumentRoot_Catalog();

		/**
		 * The meta object literal for the '{@link com.creocode.catalog.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.creocode.catalog.impl.ItemTypeImpl
		 * @see com.creocode.catalog.impl.CatalogPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Item Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__ITEM_IDENTIFIER = eINSTANCE.getItemType_ItemIdentifier();

		/**
		 * The meta object literal for the '<em><b>Template Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__TEMPLATE_ITEM = eINSTANCE.getItemType_TemplateItem();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__TITLE = eINSTANCE.getItemType_Title();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__CONTENT = eINSTANCE.getItemType_Content();

		/**
		 * The meta object literal for the '<em><b>Intro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__INTRO = eINSTANCE.getItemType_Intro();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__DETAILS = eINSTANCE.getItemType_Details();

	}

} //CatalogPackage
