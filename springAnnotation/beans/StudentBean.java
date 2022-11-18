package com.jspiders.springAnnotation.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class StudentBean {

	@Value("1")
	private int id;
	
	@Value("rahul")
	private String name;
	
	@Value("rahul@gmail.com")
	private String email;
	
	@Value("mumbai")
	private String address;
	
}
