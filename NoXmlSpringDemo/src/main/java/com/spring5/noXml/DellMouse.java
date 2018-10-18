package com.spring5.noXml;

import org.springframework.stereotype.Component;

@Component
public class DellMouse implements MouseSpeed {

	@Override
	public String speed() {
		return "dell mouse works less speed than other brand mouses";
	}

}
