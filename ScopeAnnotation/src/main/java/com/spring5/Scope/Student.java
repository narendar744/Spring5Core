package com.spring5.Scope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring5.Scope.Payment;
@Component
@Scope("prototype")
public class Student implements Payment{
	
	static int count=1;
	public Student() {
		System.out.println("this is the object no :"+count);
		count++;;
	}
	
@Override
	public String message() {
		return "payment done immidiately ";
	
	}

}
