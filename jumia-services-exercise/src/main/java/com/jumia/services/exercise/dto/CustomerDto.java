package com.jumia.services.exercise.dto;

/**
 *
 * @author Amr Elkady
 */
public class CustomerDto {
	
	private int id;

	private String name;

	private String phone;
	
	private String country;
	
	private String countryCode;
	
	private String number;
	
	private boolean state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CustomerDto{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", country=" + country + ", countryCode=" + countryCode + ", number=" + number + ", state=" + state + '}';
	}
	
	

}
