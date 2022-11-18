package com.jspiders.spring_core.beans;

import lombok.Data;

@Data
public class EmployeeBean {

	private int id;
	
	private String name;
	
	private EmployeeDetailsBean employeeDetails;
}
