package com.spring5.car;
public class Car {
	private String name;
	private String model;
	private String year;
	private String value;
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", year=" + year + ", value=" + value + "]";
	}

}
