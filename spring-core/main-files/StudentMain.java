package com.jspiders.spring_core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring_core.beans.StudentBean;

//import com.jspiders.springcore.beans.StudentBean;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
		StudentBean student1 = context.getBean(StudentBean.class);
		System.out.println(student1);
		((ClassPathXmlApplicationContext)context).close();
	}
}
