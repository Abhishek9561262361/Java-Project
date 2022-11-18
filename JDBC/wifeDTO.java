package com.jspiders.demo1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class wifeDTO {

	@Id
	private int wid;
	private String wname;
	private int wage;
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	
	
}
