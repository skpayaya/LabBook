package com.cg.iter.bean;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
    private int employeeId;
    private String employeeName;
    private double salary;
    
    private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
    public String toString()
    {   System.out.println("Employee: [empAge: "+age+", empId:  "+employeeId+", empName:  "+employeeName+", empSalary:  "+salary+"]");
//        System.out.println(getSbuDetails());
    	return "";
    	
    }
}