package com.mindgate.Main;

import java.util.List;

import com.mindgate.pojo.Empolyee;
import com.mindgate.repository.EmployeeRepository;

public class EmpolyeerepositoryMain {
public static void main(String[] args) {
	EmployeeRepository emp =new EmployeeRepository();
	Empolyee empolyee =new Empolyee("amol", 10000, 191);
	Empolyee empolyee1 =new Empolyee("raj", 10000, 190);
	Empolyee empolyee2=new Empolyee("vipul", 10000, 192);
	
	emp.addEmpolyee(empolyee1);
	emp.addEmpolyee(empolyee2);
	emp.addEmpolyee(empolyee);
	 List<Empolyee> elist =emp.getAllEmployee();
	//for(Empolyee e:elist){
		// System.out.println(e);
	 System.out.println("..................................");
		 Empolyee employee=emp.getEmployeeByid(192);
		 System.out.println(employee);
		//System.out.println(" delete");
		boolean result=emp.deleteEmpolyeeByEmployeeId(191);
		System.out.println("After delete");
		System.out.println(elist);
		System.out.println("befour update");
		System.out.println(elist);
		Empolyee upemp=new Empolyee("mitiiraju", 25000, 190);
		System.out.println("after update");
		System.out.println(upemp);
		
	 }
	 
		 
	 

}

