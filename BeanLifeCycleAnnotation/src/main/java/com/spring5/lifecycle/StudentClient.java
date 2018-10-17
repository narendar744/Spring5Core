package com.spring5.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentClient {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("beanlifeCyle-application.xml");
Greeting student= context.getBean("student",Greeting.class );
System.out.println(student.message());
((ClassPathXmlApplicationContext) context).close();
	}

}
