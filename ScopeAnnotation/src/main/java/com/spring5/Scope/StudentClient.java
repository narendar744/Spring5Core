package com.spring5.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentClient {

	public static void main(String[] args) {
@SuppressWarnings("resource")
ApplicationContext context= new ClassPathXmlApplicationContext("scope-application.xml");
Payment student= context.getBean("student",Payment.class );
System.out.println(student.message());
Payment student1= context.getBean("student",Payment.class );
System.out.println(student1.message());

	}

}
