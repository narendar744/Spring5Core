package com.spring5.collection.springIoc.greeting;

public class Wish implements Greeting {

	@Override
	public String greeting(String name) {
		return "Good morning "+name;
	}

}
