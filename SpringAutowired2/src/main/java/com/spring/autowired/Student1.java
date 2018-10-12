package com.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*
 * this class about using autowired at field level
 * 
 * 
 */

@Component
public class Student1 implements Activities	{
	@Autowired
	private Features features;

	@Override
	public String read() {
		return "i am reading book and my "+features.disp();
	}

	@Override
	public String write() {
		return "i am writing and my "+features.ram();
	}

}
