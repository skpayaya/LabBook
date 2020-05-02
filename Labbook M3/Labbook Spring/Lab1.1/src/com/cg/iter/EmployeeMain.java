package com.cg.iter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.iter.bean.Employee;

public class EmployeeMain {

	public EmployeeMain() {
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
		Employee emp=(Employee) context.getBean("employee");
		
		System.out.println("Employee");
		System.out.println("------------------------");
		System.out.println("Employee Id:	"+emp.getEmployeeId());
		System.out.println("Employee Name:	"+emp.getEmployeeName());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("Employee BU:	"+emp.getBusinessUnit());
		System.out.println("Employee Age:	"+emp.getAge());
	}

}