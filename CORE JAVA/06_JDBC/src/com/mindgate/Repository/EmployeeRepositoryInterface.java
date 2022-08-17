package com.mindgate.Repository;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeRepositoryInterface {
	boolean addNewEmployee(Employee employee) ;
 List<Employee> getAllEmplyee();
boolean deleteEmployeeByEmployeeId(int employeeId);

}
