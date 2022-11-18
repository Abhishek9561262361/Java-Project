package com.jspiders.springAnnotation.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springAnnotation.beans.StudentBean;
import com.jspiders.springAnnotation.config.StudentConfig;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean student = context.getBean(StudentBean.class);
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();
		
	}
}
