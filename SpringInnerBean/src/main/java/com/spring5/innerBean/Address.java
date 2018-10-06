package com.spring5.innerBean;

public class Address {
	private String city;


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "[city=" + city + "]";
	}

}
