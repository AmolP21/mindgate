package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mindgate.Repository.EmpolyeeRepository;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMAin {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);

System.out.println("enter Employee id");
int employeeid =scanner.nextInt(); 
scanner.nextLine();
System.out.println("enter Employee name");
    String employeeName =scanner.nextLine();
System.out.println("enter SAlary");
  double employeeSalary =scanner.nextDouble();
EmployeeServiceInterface employeeServiceInterface=new EmployeeService();


	Employee employee=new Employee(employeeid, employeeName, employeeSalary);
//Employee employee=new Employee(12, "ajinkya", 23456);
	boolean result =employeeServiceInterface.addNewEmployee(employee);
	if(result) {
		System.out.println("Insert susfullyee done...");
		
	}else {
		System.out.println("Failed");
	}
}
}
