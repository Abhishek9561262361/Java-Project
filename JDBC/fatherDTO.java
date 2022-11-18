package com.jspiders.demo1.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class fatherDTO {

	@Id
	private int id;
	private String name;
	private int age;
	
	@OneToMany
	private List<childDTO> child;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<childDTO> getChild() {
		return child;
	}

	public void setChild(List<childDTO> child) {
		this.child = child;
	}
	
	
	
}
