package com.technical.test.logic;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RentalTest {

	@Test
	public void testRental() {
		Rental rental = new Rental();
		assertTrue(rental instanceof Rental);
	}

	@Test
	public void testGetType() {
		Rental rental = new Rental();
		rental.setType(RentalType.DAY);
		assertTrue(rental.getType().equals(RentalType.DAY));
	}

	@Test
	public void testSetType() {
		Rental rental = new Rental();
		rental.setType(RentalType.HOUR);
		assertTrue(rental.getType().equals(RentalType.HOUR));
	}

	@Test
	public void testGetCost() {
		Rental rental = new Rental();
		rental.setCost(60.0);
		assertEquals(rental.getCost() , Double.valueOf(60.0));
	}

	@Test
	public void testSetCost() {
		Rental rental = new Rental();
		rental.setCost(60.0);
		rental.setCost(20.0);
		assertNotEquals(rental.getCost() , Double.valueOf(60.0));
	}

}
