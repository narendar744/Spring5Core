package springAutowired;

import org.springframework.stereotype.Component;

@Component
public class TutionFee implements Payment {

	@Override
	public String useCreditCard() {
		return "tution payment was done by credit card";
	}

	@Override
	public String useDebitCard() {
		return "tution payment was done by debit card";
	}

}
