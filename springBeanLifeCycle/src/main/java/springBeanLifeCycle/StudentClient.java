package springBeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifeCycle-application.xml");
		Student student = context.getBean("lifecycle", Student.class);
		System.out.println(student.toString());
		context.close();
	}

}
