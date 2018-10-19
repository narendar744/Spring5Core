package com.springBeanConfig.annotation;

public class HealthInsurance implements Insurance{

	public String monthInsurance() {
		return "monthly health insurence $30";
	}

	public String yearInsurance() {
		return "yearly health insurence $250";
	}

}
