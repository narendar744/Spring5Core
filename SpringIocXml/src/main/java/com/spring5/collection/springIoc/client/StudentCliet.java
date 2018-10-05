package com.spring5.collection.springIoc.client;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring5.collection.springIoc.Student;

public class StudentCliet {
	public static Logger logger= Logger.getLogger(StudentCliet.class);
	public static void main(String[] args) {
@SuppressWarnings("resource")
ApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
Student student= context.getBean("student", Student.class);
logger.info(student.toString());
System.out.println("***********************************************************");
System.out.println(student.toString());
	}

}
