package com.spring5.componentAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("morning")
@Component
public class Greeting implements Morning {
	
	private String name="narendar";
	@Autowired
	public Greeting() {
		super();
	}
	public String syaevening() {
		return "hello narendar";
	}

	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello good morning "+name;
	}
	
}
