/**
 * 
 */
package com.technical.test.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ubuntu
 *
 */
@Entity
@Table(name = "rental")
public class Rental implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1435579533908664661L;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	@Column(name = "id")
	private Long id;

	/**
	 * 
	 */
	@Column(name = "type")
	private String type;

	/**
	 * 
	 */
	@Column(name = "charge")
	private Long charge;

	/**
	 * 
	 */
	public Rental() {
		this.charge = null;
		this.id = null;
		this.type = null;
	}

	/**
	 * @return the charge
	 */
	public Long getCharge() {
		return charge;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param charge the charge to set
	 */
	public void setCharge(Long charge) {
		this.charge = charge;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
