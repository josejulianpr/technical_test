/**
 * 
 */
package com.technical.test.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.technical.test.logic.RentalType;

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
		assertEquals(Rental.getSerialversionuid(), 1435579533908664661L);
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
		Rental rental = new Rental();
		rental.setCharge(Long.valueOf("5"));
		assertEquals(rental.getCharge(), Long.valueOf("5"));
	}

	/**
	 * Test method for {@link com.technical.test.domain.Rental#getId()}.
	 */
	@Test
	public void testGetId() {
		Rental rental = new Rental();
		rental.setId(Long.valueOf("1"));
		assertEquals(rental.getId(), Long.valueOf("1"));
	}

	/**
	 * Test method for {@link com.technical.test.domain.Rental#getType()}.
	 */
	@Test
	public void testGetType() {
		Rental rental = new Rental();
		rental.setType(RentalType.DAY.name());
		assertTrue(rental.getType().equalsIgnoreCase(RentalType.DAY.name()));
	}

	/**
	 * Test method for
	 * {@link com.technical.test.domain.Rental#setCharge(java.lang.Long)}.
	 */
	@Test
	public void testSetCharge() {
		Rental rental = new Rental();
		rental.setCharge(Long.valueOf("5"));
		rental.setCharge(Long.valueOf("20"));
		assertNotEquals(rental.getCharge(), Long.valueOf("5"));
	}

	/**
	 * Test method for
	 * {@link com.technical.test.domain.Rental#setId(java.lang.Long)}.
	 */
	@Test
	public void testSetId() {
		Rental rental = new Rental();
		rental.setId(Long.valueOf("1"));
		rental.setId(Long.valueOf("2"));
		assertNotEquals(rental.getId(), Long.valueOf("1"));
	}

	/**
	 * Test method for
	 * {@link com.technical.test.domain.Rental#setType(java.lang.String)}.
	 */
	@Test
	public void testSetType() {
		Rental rental = new Rental();
		rental.setType(RentalType.DAY.name());
		rental.setType(RentalType.HOUR.name());
		assertFalse(rental.getType().equalsIgnoreCase(RentalType.DAY.name()));
	}

}
