package com.jspiders.springAnnotation.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployeeDetailsBean2 {

	private String email;
	private long phone;
	private double salary;
	private String City;
	
}
