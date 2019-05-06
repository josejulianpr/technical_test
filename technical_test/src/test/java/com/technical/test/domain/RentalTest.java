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
	 * {@link com.technical.test.domain.RentalDao#getSerialversionuid()}.
	 */
	@Test
	public void testGetSerialversionuid() {
		assertEquals(RentalDao.getSerialversionuid(), 1435579533908664661L);
	}

	/**
	 * Test method for {@link com.technical.test.domain.RentalDao#Rental()}.
	 */
	@Test
	public void testRental() {
		RentalDao rental = new RentalDao();
		assertTrue(rental instanceof RentalDao);
	}

	/**
	 * Test method for {@link com.technical.test.domain.RentalDao#getCharge()}.
	 */
	@Test
	public void testGetCharge() {
		RentalDao rental = new RentalDao();
		rental.setCharge(Long.valueOf("5"));
		assertEquals(rental.getCharge(), Long.valueOf("5"));
	}

	/**
	 * Test method for {@link com.technical.test.domain.RentalDao#getId()}.
	 */
	@Test
	public void testGetId() {
		RentalDao rental = new RentalDao();
		rental.setId(Long.valueOf("1"));
		assertEquals(rental.getId(), Long.valueOf("1"));
	}

	/**
	 * Test method for {@link com.technical.test.domain.RentalDao#getType()}.
	 */
	@Test
	public void testGetType() {
		RentalDao rental = new RentalDao();
		rental.setType(RentalType.DAY.name());
		assertTrue(rental.getType().equalsIgnoreCase(RentalType.DAY.name()));
	}

	/**
	 * Test method for
	 * {@link com.technical.test.domain.RentalDao#setCharge(java.lang.Long)}.
	 */
	@Test
	public void testSetCharge() {
		RentalDao rental = new RentalDao();
		rental.setCharge(Long.valueOf("5"));
		rental.setCharge(Long.valueOf("20"));
		assertNotEquals(rental.getCharge(), Long.valueOf("5"));
	}

	/**
	 * Test method for
	 * {@link com.technical.test.domain.RentalDao#setId(java.lang.Long)}.
	 */
	@Test
	public void testSetId() {
		RentalDao rental = new RentalDao();
		rental.setId(Long.valueOf("1"));
		rental.setId(Long.valueOf("2"));
		assertNotEquals(rental.getId(), Long.valueOf("1"));
	}

	/**
	 * Test method for
	 * {@link com.technical.test.domain.RentalDao#setType(java.lang.String)}.
	 */
	@Test
	public void testSetType() {
		RentalDao rental = new RentalDao();
		rental.setType(RentalType.DAY.name());
		rental.setType(RentalType.HOUR.name());
		assertFalse(rental.getType().equalsIgnoreCase(RentalType.DAY.name()));
	}

}
