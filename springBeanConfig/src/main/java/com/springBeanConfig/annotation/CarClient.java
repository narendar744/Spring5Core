package com.springBeanConfig.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarClient {

	public static void main(String[] args) {
AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CarConfig.class);
Car car= context.getBean("sportsCar",Car.class);
System.out.println(car.speed());
System.out.println(car.color());
System.out.println(car.toString());
context.close();
	}

}
