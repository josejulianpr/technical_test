package com.technical.test.logic;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FamilyRentalTest {

	@Test
	public void testFamilyRental() {
		FamilyRental familyRental = new FamilyRental();
		assertTrue(familyRental instanceof FamilyRental);
	}

	@Test
	public void testGetRentals() {
		List<Rental> rentals = new ArrayList<Rental>();
		Rental renal1 = new Rental();
		renal1.setType(RentalType.DAY);
		renal1.setCost(Double.valueOf("5.0"));
		Rental renal2 = new Rental();
		renal2.setType(RentalType.HOUR);
		renal2.setCost(Double.valueOf("20.0"));
		Rental renal3 = new Rental();
		renal3.setType(RentalType.WEEK);
		renal3.setCost(Double.valueOf("60.0"));
		rentals.add(renal1);
		rentals.add(renal2);
		rentals.add(renal3);
		FamilyRental familyRental = new FamilyRental();
		familyRental.getRentals().add(renal1);
		familyRental.getRentals().add(renal2);
		familyRental.getRentals().add(renal3);

		assertTrue(familyRental.getRentals().containsAll(rentals));
	}

	@Test
	public void testGetCost() {
		List<Rental> rentals = new ArrayList<Rental>();
		Rental renal1 = new Rental();
		renal1.setType(RentalType.DAY);
		renal1.setCost(Double.valueOf("5.0"));
		Rental renal2 = new Rental();
		renal2.setType(RentalType.HOUR);
		renal2.setCost(Double.valueOf("20.0"));
		Rental renal3 = new Rental();
		renal3.setType(RentalType.WEEK);
		renal3.setCost(Double.valueOf("60.0"));
		rentals.add(renal1);
		rentals.add(renal2);
		rentals.add(renal3);
		FamilyRental familyRental = new FamilyRental();
		familyRental.getRentals().add(renal1);
		familyRental.getRentals().add(renal2);
		familyRental.getRentals().add(renal3);

		assertTrue(familyRental.getCost() == 85.0);
	}

}
