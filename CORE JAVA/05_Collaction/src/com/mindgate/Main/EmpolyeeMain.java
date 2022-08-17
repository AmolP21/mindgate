package com.mindgate.Main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Empolyee;
import com.mindgate.repository.EmployeeRepository;

public class EmpolyeeMain {
public static void main(String[] args) {
	Set<Empolyee> empset =new HashSet<>();
	Empolyee e1 =new Empolyee("ajay", 15000, 100);
	//System.out.println("e1::"+e1.hashCode());
	Empolyee e2 =new Empolyee("ajay", 15000, 100);
	//System.out.println("e2::"+e2.hashCode());
	empset.add(e1);
empset.add(e2);
for(Empolyee empolyee:empset) {
	System.out.println(empolyee);
}
}
}
