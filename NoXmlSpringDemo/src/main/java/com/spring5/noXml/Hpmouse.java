package com.spring5.noXml;

import org.springframework.stereotype.Component;

@Component
public class Hpmouse implements MouseSpeed {

	@Override
	public String speed() {
		return "Hp mouse mouse works very fast";
	}

}
