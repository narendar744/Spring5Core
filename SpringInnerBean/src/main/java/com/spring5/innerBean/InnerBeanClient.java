package com.spring5.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanClient {

	public static void main(String[] args) {
@SuppressWarnings("resource")
ApplicationContext context= new ClassPathXmlApplicationContext("innerbean-application.xml");
Student student= context.getBean("student",Student.class);
System.out.println(student.toString());
	}

}
