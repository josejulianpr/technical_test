package com.technical.test.logic;

public class Rental {
	
	/**
	 * 
	 */
	RentalType type;
	
	/**
	 * 
	 */
	Double cost ;
	
	public Rental() {
		// TODO Auto-generated constructor stub
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
