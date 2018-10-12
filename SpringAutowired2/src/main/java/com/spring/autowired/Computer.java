package com.spring.autowired;

import org.springframework.stereotype.Component;

@Component
public class Computer implements Features{

	@Override
	public String disp() {
		return " computer has retina display";
	}

	@Override
	public String ram() {
		return " computer has 16GB ram";
	}

}
