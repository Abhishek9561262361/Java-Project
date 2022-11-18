package com.jspiders.spring_core.beans;

import lombok.Data;

@Data
public class SportsBean {

	private int id;
	private String name;
	private double players;
	private AcademyBean academy;
}
