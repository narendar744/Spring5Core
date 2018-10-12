package com.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * this class about using autowired at constructor level level
 * 
 * 
 */


@Component
public class Student3 implements Activities	{
	
	private Features features;
	//@Autowired
	public Student3(Features features) {
		this.features = features;
	}

	@Override
	public String read() {
		return "i am reading book and my "+features.disp();
	}

	@Override
	public String write() {
		return "i am writing and my "+features.ram();
	}

}
