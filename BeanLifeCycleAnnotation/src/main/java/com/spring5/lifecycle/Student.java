package com.spring5.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component

public class Student implements Greeting{

	@PostConstruct
	public void  mrngWish() {
		System.out.println("Good morning");
		
	
	}
	@PreDestroy
	public void  nightWish() {
		System.out.println("Good night");
		
	
	}
	
@Override
	public String message() {
		return "Stay Happy.. Happy coding";
	
	}

}
