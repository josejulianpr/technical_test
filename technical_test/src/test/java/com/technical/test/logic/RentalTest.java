package com.technical.test.logic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
		assertTrue(rental.getCost().doubleValue()== 60.0);
	}

	@Test
	public void testSetCost() {
		Rental rental = new Rental();
		rental.setCost(60.0);
		assertTrue(rental.getCost().doubleValue()== 60.0);
	}

}
