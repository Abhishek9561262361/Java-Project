package com.jspiders.springAnnotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployeeDetailsBean {

	@Value("arun@gamil.com")
	private String email;
	
	@Value("98746511230")
	private long phone;

	@Value("50000")
	private double salary;
	
	@Value("lonavla")
	private String address;
}
