package com.jspiders.spring_core.beans;

import java.util.List;

import lombok.Data;

@Data
public class PhoneBean {

	private int id;
	private String name;
	private double price;
	private List<ApplicationBean> applications;
	
}
