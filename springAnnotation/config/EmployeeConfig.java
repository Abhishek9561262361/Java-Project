package com.jspiders.springAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspiders.springAnnotation.beans.EmployeeBean;

@ComponentScan("com.jspiders.springAnnotation")
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployee() {
		return new EmployeeBean();
	}
}
