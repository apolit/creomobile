/**
 */
package com.creocode.catalog.tests;

import com.creocode.catalog.CatalogFactory;
import com.creocode.catalog.CategoryType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Category Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CategoryTypeTest extends TestCase {

	/**
	 * The fixture for this Category Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CategoryTypeTest.class);
	}

	/**
	 * Constructs a new Category Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Category Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CategoryType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Category Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CatalogFactory.eINSTANCE.createCategoryType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CategoryTypeTest
