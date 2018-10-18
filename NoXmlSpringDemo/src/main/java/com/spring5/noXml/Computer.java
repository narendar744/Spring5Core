package com.spring5.noXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;

@Configuration
//@Component
@ComponentScan("com.spring5.noXml")
public class Computer implements Mouse {
	
	
	private MouseSpeed mousespeed;
	@Autowired
	public Computer(@Qualifier("dellMouse") MouseSpeed mousespeed) {
		this.mousespeed = mousespeed;
	}

	@Override
	public String leftClick() {
		return "left click working very good";
	}

	@Override
	public String rightClick() {
		return "right click working fine and "+mousespeed.speed();
	}

}
