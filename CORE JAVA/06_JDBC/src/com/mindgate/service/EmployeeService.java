package com.mindgate.service;

import java.util.List;

import com.mindgate.Repository.EmployeeRepositoryInterface;
import com.mindgate.Repository.EmpolyeeRepository;
import com.mindgate.pojo.Employee;

public class EmployeeService implements EmployeeServiceInterface {
private EmployeeRepositoryInterface employeeRepositoryInterface=new EmpolyeeRepository();


	@Override
	public boolean addNewEmployee(Employee employee) {
	System.out.println("in service");
	
		return employeeRepositoryInterface.addNewEmployee(employee);
	}


	@Override
	public List<Employee> getAllEmplyee() {
		
		return employeeRepositoryInterface.getAllEmplyee();
	}


	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}


	

	



	
	
	
}
