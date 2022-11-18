package com.jspiders.springAnnotation.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springAnnotation.beans.EmployeeBean2;
import com.jspiders.springAnnotation.config.EmployeeConfig2;

public class EmployeeMain2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig2.class);
		EmployeeBean2 details  = (EmployeeBean2) context.getBean("emp1");
		System.out.println(details);
		EmployeeBean2 details2  = (EmployeeBean2) context.getBean("emp2");
		System.out.println(details2);
		((AnnotationConfigApplicationContext)context).close();
		
	}
}
