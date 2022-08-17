package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		
	
int employeeid;
String employeename;
double employeesalary;
int choice;
String ContinueChoice;
Scanner scanner =new Scanner(System.in);
EmployeeServiceInterface employeeServiceInterface=new EmployeeService();
List<Employee> AllEmployeeList;

do {
	
	
System.out.println("Main");
System.out.println("1:ADD NEW EMPLOYEE");
System.out.println("2:UPDATE EMPLOYEE");
System.out.println("3;DELETE EMPLOYEE");
System.out.println("4:SELECT ONE EMPLOYEE");
System.out.println("5SELECT ALL EMPLOYEE");
System.out.println("ENter your choice");
choice=scanner.nextInt();
switch(choice) {
case 1:

//Scanner scan =new Scanner(System.in);
System.out.println("Enter Employeeid  ");
employeeid =scanner.nextInt();
scanner.nextLine();
System.out.println("ENter employeee NAME");
employeename =scanner.nextLine();
System.out.println("Enterr empsalary");
employeesalary =scanner.nextDouble();
	Employee employee=new Employee(employeeid, employeename, employeesalary);
	boolean result =employeeServiceInterface.addNewEmployee(employee);
	if(result) {
		System.out.println("Insert susfullyee done...");
		
	}else {
		System.out.println("Failed");
	}
break;
case 2:
	break;
case 3:
	System.out.println("Enter Employeeid  ");
	employeeid =scanner.nextInt();
	result =employeeServiceInterface.deleteEmployeeByEmployeeId(employeeid);
	if(result) {
		System.out.println("delete susfullyee done...");
		
	}else {
		System.out.println( " delete Failed");
	}
	break;
case 4:
	break;
case 5: 
	AllEmployeeList =employeeServiceInterface.getAllEmplyee();
	for(Employee e: AllEmployeeList) {
		System.out.println(e);
	}
	break;
	default :System.out.println("Invalied choice");
	break;
}System.out.println("DO you want to continue");
ContinueChoice=scanner.next();

}while(ContinueChoice.equals("yes"));
}
}
