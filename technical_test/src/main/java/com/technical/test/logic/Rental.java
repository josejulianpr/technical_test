package com.technical.test.logic;

/**
 * Clase con lo logica de Rental
 * 
 * @author Jose Julian Prado
 *
 */
public class Rental {

	/**
	 * Tipo del Rental
	 */
	RentalType type;

	/**
	 * Costo del Rental
	 */
	Double cost;

	/**
	 * Constructor vacio
	 */
	public Rental() {
		// Constructor vacio
	}

	/**
	 * @return the type
	 */
	public RentalType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(RentalType type) {
		this.type = type;
	}

	/**
	 * @return the cost
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}

}
