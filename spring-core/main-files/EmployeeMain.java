package com.jspiders.spring_core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring_core.beans.EmployeeBean;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeConfig.xml");
		EmployeeBean employee1 = (EmployeeBean) context.getBean("employee1");
		System.out.println(employee1);
		((ClassPathXmlApplicationContext)context).close();
		
	}
}
