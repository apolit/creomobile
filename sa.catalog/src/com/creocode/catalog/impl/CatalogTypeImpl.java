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
import com.creocode.catalog.CatalogType;
import com.creocode.catalog.CategoryType;
import java.util.Collection;
import com.creocode.catalog.CategoriesType;

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
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getCopyrights <em>Copyrights</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.creocode.catalog.impl.CatalogTypeImpl#getVersionCode <em>Version Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogTypeImpl extends EObjectImpl implements CatalogType {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryType> category;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyrights() <em>Copyrights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrights()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrights() <em>Copyrights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrights()
	 * @generated
	 * @ordered
	 */
	protected String copyrights = COPYRIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = "catalog";

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * This is true if the Icon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iconESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "ApplicationName";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = "english";

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean languageESet;

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
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected String versionCode = VERSION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.CATALOG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryType> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CategoryType>(CategoryType.class, this, CatalogPackage.CATALOG_TYPE__CATEGORY);
		}
		return category;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyrights() {
		return copyrights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyrights(String newCopyrights) {
		String oldCopyrights = copyrights;
		copyrights = newCopyrights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__COPYRIGHTS, oldCopyrights, copyrights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionCode() {
		return versionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionCode(String newVersionCode) {
		String oldVersionCode = versionCode;
		versionCode = newVersionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__VERSION_CODE, oldVersionCode, versionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		boolean oldIconESet = iconESet;
		iconESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__ICON, oldIcon, icon, !oldIconESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIcon() {
		String oldIcon = icon;
		boolean oldIconESet = iconESet;
		icon = ICON_EDEFAULT;
		iconESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CatalogPackage.CATALOG_TYPE__ICON, oldIcon, ICON_EDEFAULT, oldIconESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIcon() {
		return iconESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		String oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CatalogPackage.CATALOG_TYPE__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		boolean oldLanguageESet = languageESet;
		languageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__LANGUAGE, oldLanguage, language, !oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguage() {
		String oldLanguage = language;
		boolean oldLanguageESet = languageESet;
		language = LANGUAGE_EDEFAULT;
		languageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CatalogPackage.CATALOG_TYPE__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguage() {
		return languageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.CATALOG_TYPE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
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
			case CatalogPackage.CATALOG_TYPE__CATEGORY:
				return getCategory();
			case CatalogPackage.CATALOG_TYPE__AUTHOR:
				return getAuthor();
			case CatalogPackage.CATALOG_TYPE__COPYRIGHTS:
				return getCopyrights();
			case CatalogPackage.CATALOG_TYPE__ICON:
				return getIcon();
			case CatalogPackage.CATALOG_TYPE__ID:
				return getId();
			case CatalogPackage.CATALOG_TYPE__LANGUAGE:
				return getLanguage();
			case CatalogPackage.CATALOG_TYPE__TITLE:
				return getTitle();
			case CatalogPackage.CATALOG_TYPE__VENDOR:
				return getVendor();
			case CatalogPackage.CATALOG_TYPE__VERSION:
				return getVersion();
			case CatalogPackage.CATALOG_TYPE__VERSION_CODE:
				return getVersionCode();
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
			case CatalogPackage.CATALOG_TYPE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CategoryType>)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__COPYRIGHTS:
				setCopyrights((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__ICON:
				setIcon((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__ID:
				setId((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__VENDOR:
				setVendor((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__VERSION_CODE:
				setVersionCode((String)newValue);
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
			case CatalogPackage.CATALOG_TYPE__CATEGORY:
				getCategory().clear();
				return;
			case CatalogPackage.CATALOG_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CatalogPackage.CATALOG_TYPE__COPYRIGHTS:
				setCopyrights(COPYRIGHTS_EDEFAULT);
				return;
			case CatalogPackage.CATALOG_TYPE__ICON:
				unsetIcon();
				return;
			case CatalogPackage.CATALOG_TYPE__ID:
				unsetId();
				return;
			case CatalogPackage.CATALOG_TYPE__LANGUAGE:
				unsetLanguage();
				return;
			case CatalogPackage.CATALOG_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CatalogPackage.CATALOG_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case CatalogPackage.CATALOG_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CatalogPackage.CATALOG_TYPE__VERSION_CODE:
				setVersionCode(VERSION_CODE_EDEFAULT);
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
			case CatalogPackage.CATALOG_TYPE__CATEGORY:
				return category != null && !category.isEmpty();
			case CatalogPackage.CATALOG_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CatalogPackage.CATALOG_TYPE__COPYRIGHTS:
				return COPYRIGHTS_EDEFAULT == null ? copyrights != null : !COPYRIGHTS_EDEFAULT.equals(copyrights);
			case CatalogPackage.CATALOG_TYPE__ICON:
				return isSetIcon();
			case CatalogPackage.CATALOG_TYPE__ID:
				return isSetId();
			case CatalogPackage.CATALOG_TYPE__LANGUAGE:
				return isSetLanguage();
			case CatalogPackage.CATALOG_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CatalogPackage.CATALOG_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case CatalogPackage.CATALOG_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CatalogPackage.CATALOG_TYPE__VERSION_CODE:
				return VERSION_CODE_EDEFAULT == null ? versionCode != null : !VERSION_CODE_EDEFAULT.equals(versionCode);
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
		result.append(" (author: ");
		result.append(author);
		result.append(", copyrights: ");
		result.append(copyrights);
		result.append(", icon: ");
		if (iconESet) result.append(icon); else result.append("<unset>");
		result.append(", id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(", versionCode: ");
		result.append(versionCode);
		result.append(')');
		return result.toString();
	}

} //CatalogTypeImpl
