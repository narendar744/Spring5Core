package com.spring5.qualifier;

import org.springframework.stereotype.Component;

@Component
public class MorningWork implements Duties {

	@Override
	public String Work() {
		return "Reading Assignment";
	}

}
