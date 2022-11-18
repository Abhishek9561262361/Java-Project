package com.jspiders.spring_core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring_core.beans.PhoneBean;

public class PhoneMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("PhoneConfig.xml");
		PhoneBean phone1 = (PhoneBean) context.getBean("phone1");
		PhoneBean phone2 = (PhoneBean) context.getBean("phone2");
		System.out.println(phone1);
		System.out.println(phone2);
		((ClassPathXmlApplicationContext)context).close();
		
	}
}
