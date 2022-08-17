package com.mindgate.pojo;

public class Employee {
 private int employeid;
 private String name;
 private double salary;
 private Address homeAddress;
 public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int employeid, String name, double salary, Address homeAddress) {
	super();
	this.employeid = employeid;
	this.name = name;
	this.salary = salary;
	this.homeAddress = homeAddress;
}
public int getEmployeid() {
	return employeid;
}
public void setEmployeid(int employeid) {
	this.employeid = employeid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Address getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(Address homeAddress) {
	this.homeAddress = homeAddress;
}
@Override
public String toString() {
	return "Employee [employeid=" + employeid + ", name=" + name + ", salary=" + salary + ", homeAddress=" + homeAddress
			+ "]";
}
 
}
