package com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String zipCode;
	private String city;
	private String street;
//	@ManyToOne(optional=true)
//	private Customer cust;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String zipCode, String city, String street) {
		super();
		this.zipCode = zipCode;
		this.city = city;
		this.street = street;
	}

	/**
	 * @param id
	 * @param zipCode
	 * @param city
	 * @param street
	 */
	public Address(Long id, String zipCode, String city, String street) {
		super();
		this.id = id;
		this.zipCode = zipCode;
		this.city = city;
		this.street = street;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [" + (id != null ? "id=" + id + ", " : "")
				+ (zipCode != null ? "zipCode=" + zipCode + ", " : "") + (city != null ? "city=" + city + ", " : "")
				+ (street != null ? "street=" + street : "") + "]";
	}

}
