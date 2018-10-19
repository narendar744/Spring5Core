package com.spring5.noXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MouseClient {

	public static void main(String[] args) {
AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ComputerConfig.class);
Mouse mouse= context.getBean("computer",Mouse.class);
System.out.println(mouse.leftClick());
System.out.println(mouse.rightClick());
context.close();
	}

}
