package com.mindgate.pojo;

import java.util.Objects;

public class Empolyee {
	private String empname;
	private double salary;
	private int empid;
	public Empolyee() {
		// TODO Auto-generated constructor stub
	}
	public Empolyee(String empname, double salary, int empid) {
		super();
		this.empname = empname;
		this.salary = salary;
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Empolyee [empname=" + empname + ", salary=" + salary + ", empid=" + empid + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("in hashcode");
		return Objects.hash(empid, empname, salary);
	}
	@Override
	public boolean equals(Object obj) {
	System.out.println(" in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empolyee other = (Empolyee) obj;
		return empid == other.empid && Objects.equals(empname, other.empname)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

}
