package com.cg.iter.bean;


import java.util.ArrayList;
import java.util.List;

public class SBU {

	public SBU() {
		// TODO Auto-generated constructor stub
	}
    private int sbuId;
    private String sbuName;
    private String sbuHead;
    private List<Employee> empList=new ArrayList<Employee>();
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String toString()
	{
		return "SBU Details:  [ sbuId:  "+sbuId+", sbuHead:  "+sbuHead+", sbuName:  "+sbuName+"]";
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
}