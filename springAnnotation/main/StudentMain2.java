package com.jspiders.springAnnotation.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springAnnotation.beans.StudentBean2;
import com.jspiders.springAnnotation.config.StudentConfig2;

public class StudentMain2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig2.class);
		StudentBean2 student1 = (StudentBean2) context.getBean("student1");
		System.out.println(student1);
		StudentBean2 student2 = (StudentBean2) context.getBean("student");
		System.out.println(student2);
		((AnnotationConfigApplicationContext)context).close();
	}
}
