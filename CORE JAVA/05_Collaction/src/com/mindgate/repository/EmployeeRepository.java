package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Empolyee;

public class EmployeeRepository {
	List<Empolyee> e = new ArrayList<>();

	public boolean addEmpolyee(Empolyee emp) {

		return e.add(emp);
	}

	public List<Empolyee> getAllEmployee() {

		return e;
	}

	public Empolyee getEmployeeByid(int empolyeeid) {
		for (Empolyee empolyee : e) {
			if (empolyee.getEmpid() == empolyeeid) {
				return empolyee;
			}

		}
		return null;

	}
	public boolean  deleteEmpolyeeByEmployeeId(int employeeid) {
		for(Empolyee empolyee:e) {
			if(empolyee.getEmpid() ==employeeid) {
				boolean result =e.remove(empolyee);
				return result;
			}
			
		}
	return false;
	
	}
	public boolean updatemyEmpolyee(Empolyee emp){
		for(Empolyee em:e) {
			if(em.getEmpid() ==emp.getEmpid()) {
			emp.setEmpname(emp.getEmpname());	
			emp.setSalary(emp.getSalary());
			return true;
			}
			
		}
		return false;
	}
}
