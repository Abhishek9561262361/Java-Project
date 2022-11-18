package com.jspiders.spring_core.beans;

import java.util.List;

import lombok.Data;

@Data
public class DoctorBean {

	private int id;
	private String name;
	private List<PatientBean> patients;
}
