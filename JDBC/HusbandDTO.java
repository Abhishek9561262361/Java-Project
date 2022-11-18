package com.jspiders.demo1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class HusbandDTO {
	@Id
	private int hid; 
	private String hname;
	private int hage;
	
	@OneToOne
	private wifeDTO wife;

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public int getHage() {
		return hage;
	}

	public void setHage(int hage) {
		this.hage = hage;
	}

	public wifeDTO getWife() {
		return wife;
	}

	public void setWife(wifeDTO wife) {
		this.wife = wife;
	}
	
	
	
}
