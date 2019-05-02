package com.technical.test.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase con lo logica de las FamilyRental
 * 
 * @author Jose Julian Prado
 *
 */
public class FamilyRental {

	/**
	 * Lista de Rental
	 */
	List<Rental> rentals;

	public FamilyRental() {
		this.rentals = new ArrayList<>();
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
			cost += rental.getCost().doubleValue();
		}
		cost -= cost * 0.30;

		return Double.valueOf(cost);
	}

}
