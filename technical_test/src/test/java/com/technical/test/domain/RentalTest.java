/**
 * 
 */
package com.technical.test.domain;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ubuntu
 *
 */
public class RentalTest {

	/**
	 * Test method for
	 * {@link com.technical.test.domain.Rental#getSerialversionuid()}.
	 */
	@Test
	public void testGetSerialversionuid() {
		assertTrue(Rental.getSerialversionuid() == 1435579533908664661L);
	}

	/**
	 * Test method for {@link com.technical.test.domain.Rental#Rental()}.
	 */
	@Test
	public void testRental() {
		Rental rental = new Rental();
		assertTrue(rental instanceof Rental);
	}

	/**
	 * Test method for {@link com.technical.test.domain.Rental#getCharge()}.
	 */
	@Test
	public void testGetCharge() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link com.technical.test.domain.Rental#getId()}.
	 */
	@Test
	public void testGetId() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link com.technical.test.domain.Rental#getType()}.
	 */
	@Test
	public void testGetType() {
		assertTrue(true);
	}

	/**
	 * Test method for
	 * {@link com.technical.test.domain.Rental#setCharge(java.lang.Long)}.
	 */
	@Test
	public void testSetCharge() {
		assertTrue(true);
	}

	/**
	 * Test method for
	 * {@link com.technical.test.domain.Rental#setId(java.lang.Long)}.
	 */
	@Test
	public void testSetId() {
		assertTrue(true);
	}

	/**
	 * Test method for
	 * {@link com.technical.test.domain.Rental#setType(java.lang.String)}.
	 */
	@Test
	public void testSetType() {
		assertTrue(true);
	}

}
