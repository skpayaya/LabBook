package com.cg.iter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.iter.bean.Employee;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
        Employee emp=(Employee) context.getBean("employee");
        System.out.println(emp);
	}

}