package com.spring5.qualifier;

import org.springframework.stereotype.Component;

@Component
public class EveningWork implements Duties {

	@Override
	public String Work() {
		// TODO Auto-generated method stub
		return "finish daily written assignment by 6pm";
	}

}
