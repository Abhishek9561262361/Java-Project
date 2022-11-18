package com.jspiders.springAnnotation.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springAnnotation.beans.StudentBean;

public class StudentConfig {

	@Bean
	public StudentBean getstudent() {
		return new StudentBean();
	}
}
