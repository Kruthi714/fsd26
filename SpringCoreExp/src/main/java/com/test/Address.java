package com.test;

public class Address {
	private String city;
	private String state;
	private String country;
	public Address() {
		
	}
	//default constructor is needed if we create parametrized constructor
	
	public Address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
