package com.jspiders.spring_core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring_core.beans.UniversityBean;

public class UniversityMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("universityConfig.xml");
	    UniversityBean university1 = context.getBean(UniversityBean.class);
	    System.out.println(university1);
	    ((ClassPathXmlApplicationContext)context).close();
	}
}
