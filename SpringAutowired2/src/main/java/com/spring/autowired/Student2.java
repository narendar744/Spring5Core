package com.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*
 * this class about using autowired at method level
 * 
 * 
 */


@Component
public class Student2  implements Activities	{
	
	private Features features;

	@Override
	public String read() {
		return "i am reading book and my "+features.disp();
	}

	@Override
	public String write() {
		return "i am writing and my "+features.ram();
	}
	@Autowired
	public void message(Features  features) {
		System.out.println(features.disp()+"use very carefully");
	}

}
