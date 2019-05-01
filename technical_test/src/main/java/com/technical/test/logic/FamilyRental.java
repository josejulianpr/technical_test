package com.technical.test.logic;

import java.util.ArrayList;
import java.util.List;

public class FamilyRental {

	/**
	 * 
	 */
	List<Rental> rentals;

	public FamilyRental() {
		this.rentals = new ArrayList<Rental>();
	}

	/**
	 * @return the rentals
	 */
	public List<Rental> getRentals() {
		return this.rentals;
	}

	/**
	 * @return the cost
	 */
	public Double getCost() {
		double cost = 0.0;
		for (Rental rental : this.rentals) {
			cost += rental.getCost().longValue();
		}
		cost = cost - cost * 0.30;

		return Double.valueOf(cost);
	}

}
