package com.jspiders.springAnnotation.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springAnnotation.beans.StudentBean2;

public class StudentConfig2 {

	@Bean("student")
	public StudentBean2 getstudent1() {
		StudentBean2 student = new StudentBean2();
		student.setId(1);
		student.setName("rohit");
		student.setEmail("rohit@gmail.com");
		student.setAddress("solapur");
		return student;
	}
	
	@Bean("student1")
	public StudentBean2 getstudent() {
		StudentBean2 student1 = new StudentBean2();
		student1.setId(2);
		student1.setName("sumit");
		student1.setEmail("sumit@gmail.com");
		student1.setAddress("sangli");
		return student1;
	}
}
