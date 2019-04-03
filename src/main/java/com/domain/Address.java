package com.domain;

public class Address {
	private Long id;
	private String zipCode;
	private String city;
	private String street;

	public Long getId() {
		return id;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

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

	}
	
	public Address(String zipCode, String city, String street) {
		super();
		this.zipCode = zipCode;
		this.city = city;
		this.street = street;
	}

	public Address(Long id, String zipCode, String city, String street) {
		super();
		this.id = id;
		this.zipCode = zipCode;
		this.city = city;
		this.street = street;
	}

	public String toString() {
		return "Address [" + (id != null ? "id=" + id + ", " : "")
				+ (zipCode != null ? "zipCode=" + zipCode + ", " : "") + (city != null ? "city=" + city + ", " : "")
				+ (street != null ? "street=" + street : "") + "]";
	}
}
