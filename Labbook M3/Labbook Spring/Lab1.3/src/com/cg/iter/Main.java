package com.cg.iter;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.iter.bean.Employee;
import com.cg.iter.bean.SBU;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
        SBU sbu=(SBU) context.getBean("sbu");
        System.out.println(sbu.getSbuId());
        System.out.println(sbu.getSbuHead());
        System.out.println(sbu.getSbuName());
        List<Employee> employees = sbu.getEmpList();
        System.out.println("Employees List:");
        for (Employee employee : employees) {
			System.out.println(employee);
		}
        
	}

}