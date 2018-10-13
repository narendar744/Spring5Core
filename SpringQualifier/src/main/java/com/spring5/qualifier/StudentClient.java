package com.spring5.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StudentClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("qualifier-application.xml");
		Exams exam= context.getBean("student",Exams.class);
		System.out.println(exam.physicsExm());
		System.out.println(exam.mathsExm());

	}

}
