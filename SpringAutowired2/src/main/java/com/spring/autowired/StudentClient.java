package com.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("autowired-application.xml");
Activities activities= context.getBean("student4",Activities.class);
System.out.println(activities.read());
System.out.println(activities.write());

	}

}
