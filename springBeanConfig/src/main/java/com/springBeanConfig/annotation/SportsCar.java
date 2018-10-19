package com.springBeanConfig.annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class SportsCar implements Car {
	private Insurance insurance;
	@Value("${file.name}")
	private String name;
	@Value("${file.price}")
	private Long price;
	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
@Required
	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SportsCar [insurance=" + insurance.monthInsurance() + ", name=" + name + ", price=" + price + "]";
	}

	public SportsCar(Insurance insurance) {
		this.insurance = insurance;
	}

	public String speed() {
		return "car speed 100 m/h";
	}

	public String color() {
		return "this car has block  color and insurance price : "+insurance.monthInsurance()+" or  "+insurance.yearInsurance();
	}

}
