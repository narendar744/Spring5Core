package com.springBeanscope.client;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springBeanscope.item.Items;

public class Beanscope {
	public static Logger logger= Logger.getLogger(Beanscope.class);
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springbean-application.xml");
		Items vegitemslist = context.getBean("singleton", Items.class);
		Items vegitemslist1 = context.getBean("singleton", Items.class);
		boolean test = (vegitemslist == vegitemslist1);
		System.out.println(test);
		System.out.println(vegitemslist);
		System.out.println(vegitemslist1);
		logger.info(vegitemslist.Itemsavailable());
		
		@SuppressWarnings("resource")
		ApplicationContext context1 = new ClassPathXmlApplicationContext("springbean-application.xml");
		Items nonVegitemslist = context1.getBean("prototype", Items.class);
		Items nonVegitemslist1 = context1.getBean("prototype", Items.class);
		boolean test1 = (nonVegitemslist == nonVegitemslist1);
		System.out.println(test1);
		System.out.println(nonVegitemslist);
		System.out.println(nonVegitemslist1);
		logger.info(nonVegitemslist.Itemsavailable());
	}

}
