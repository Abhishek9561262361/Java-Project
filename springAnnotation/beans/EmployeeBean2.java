package com.jspiders.springAnnotation.beans;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class EmployeeBean2 {

	private int id;
	private String name;
	@Autowired
	private EmployeeDetailsBean2 details;
	
}
