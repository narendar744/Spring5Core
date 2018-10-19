package com.springBeanConfig.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springBeanConfig.annotation")
@PropertySource("userlist.properties")

public class CarConfig {
	@Bean
	public Insurance insurance() {
		return  new CarInsurance() ;
	}
	
	@Bean
	public Insurance insurance1() {
		return  new HealthInsurance() ;
	}
	
	
	@Bean
	public Car sportsCar() {
		return new SportsCar(insurance1());
	}

}
