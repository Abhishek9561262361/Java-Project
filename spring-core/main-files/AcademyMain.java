package com.jspiders.spring_core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring_core.beans.SportsBean;

public class AcademyMain {

	public static void main(String[] args) {
		ApplicationContext context =new  ClassPathXmlApplicationContext("AcademyConfig.xml");
	    SportsBean sport1 = (SportsBean) context.getBean("sport1");
	    SportsBean sport2 = (SportsBean) context.getBean("sport2");
	    System.out.println(sport1);
	    System.out.println(sport2);
	    ((ClassPathXmlApplicationContext) context).close();
	}
}
