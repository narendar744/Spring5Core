package com.spring5.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarClient {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
Car maruthi= context.getBean("maruthi", Car.class);
System.out.println(maruthi.toString());
Car audi= context.getBean("audi", Car.class);
System.out.println(audi.toString());
((ClassPathXmlApplicationContext) context).close();

	}

}
