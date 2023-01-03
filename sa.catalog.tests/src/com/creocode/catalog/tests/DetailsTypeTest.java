/**
 */
package com.creocode.catalog.tests;

import com.creocode.catalog.CatalogFactory;
import com.creocode.catalog.DetailsType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Details Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DetailsTypeTest extends TestCase {

	/**
	 * The fixture for this Details Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailsType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DetailsTypeTest.class);
	}

	/**
	 * Constructs a new Details Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailsTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Details Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DetailsType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Details Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailsType getFixture() {
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
		setFixture(CatalogFactory.eINSTANCE.createDetailsType());
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

} //DetailsTypeTest
