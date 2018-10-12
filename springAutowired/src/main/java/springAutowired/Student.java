package springAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student implements Activities {
	private String name = "narendar";
	private Payment payment;

					// ******************constructor injection*********************
	// @Autowired
	public Student(Payment payment) {
		this.payment = payment;
	}

					// *******************Setter injection****************
	/*
	 * @Autowired 
	 * public void setPayment(Payment payment) { 
	 * this.payment = payment;
	 * }
	 */

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String reading() {
		return name + " is reading book and " + payment.useCreditCard();
	}

	@Override
	public String writing() {
		return name + " is writing Exam today and " + payment.useDebitCard();
	}

}
