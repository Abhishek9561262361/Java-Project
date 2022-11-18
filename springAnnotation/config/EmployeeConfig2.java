package com.jspiders.springAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspiders.springAnnotation.beans.EmployeeBean2;
import com.jspiders.springAnnotation.beans.EmployeeDetailsBean2;

@ComponentScan("com.jspiders.springAnnotation")
public class EmployeeConfig2 {

	@Bean("emp1")
	public EmployeeBean2 getemp() {
		
		EmployeeDetailsBean2 details = new EmployeeDetailsBean2();
		details.setEmail("rohan@gmail.com");
		details.setPhone(789456123);
		details.setSalary(50000);
		details.setCity("pune");
		EmployeeBean2 emp1 = new EmployeeBean2();
		emp1.setId(1);
		emp1.setName("rohan");
		emp1.setDetails(details);
		return emp1;
		
	}
	
	@Bean("emp2")
	public EmployeeBean2 getemp2() {
		
		EmployeeDetailsBean2 details2 = new EmployeeDetailsBean2();
		details2.setEmail("rohan@gmail.com");
		details2.setPhone(789456123);
		details2.setSalary(50000);
		details2.setCity("pune");
		EmployeeBean2 emp2 = new EmployeeBean2();
		emp2.setId(1);
		emp2.setName("rohan");
		emp2.setDetails(details2);
		return emp2;
		
	}
}
