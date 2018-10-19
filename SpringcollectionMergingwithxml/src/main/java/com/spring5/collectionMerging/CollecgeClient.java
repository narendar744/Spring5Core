package com.spring5.collectionMerging;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollecgeClient {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("collcetionmering-application.xml");
College networning= context.getBean("computers and networking", College.class);
System.out.println(networning.toString());

College computers= context.getBean("computers", College.class);
System.out.println(computers.toString());
((ClassPathXmlApplicationContext) context).close();
	}

}
