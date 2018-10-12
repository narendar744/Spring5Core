package springAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("component-application.xml");
Activities activities= context.getBean("student",Activities.class);
System.out.println(activities.reading());
System.out.println(activities.writing());

	}

}
