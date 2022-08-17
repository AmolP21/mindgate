package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {
public static void main(String[] args) {
	System.out.println("main start");
	System.out.println("Creating the adress object and set method");
/*Address address=new Address();
 address.setAddressid(1);
 address.setBuildingName("pusha complex");
 address.setCity("pune");
 address.setHouseNumber("102");
 address.setPin("410405");
 address.setStreet("FG road");
 System.out.println(address);*/
System.out.println("main ends");
/*System.out.println();
System.out.println("Creating the adress object and set method");
Employee employee =new Employee(2, "amol", 2000, address);
System.out.println(employee);*/
Address address =new Address(1, "101", "gogel", "gf road", "bombay", "423244");
Employee employee =new Employee(3, "raj", 4999, address);
System.out.println(employee);
}
}
