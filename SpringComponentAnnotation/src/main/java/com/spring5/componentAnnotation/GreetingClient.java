package com.spring5.componentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Narendar
 *
 */
public class GreetingClient {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("component-application.xml");
//Greeting greeting=context.getBean("morning",Greeting.class);
Greeting greeting=context.getBean("greeting",Greeting.class);
System.out.println(greeting.sayHello());


	}

}
