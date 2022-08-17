package com.mindgate.Main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Empolyee;

public class HashSetWorkingMain {
	public static void main(String[] args) {
		
	
	Empolyee e1 = new Empolyee("ajay", 15000, 100);
	Empolyee e2 = new Empolyee("ajay", 15000, 100);
	Set<Empolyee> set = new HashSet<>();
set.add(e2);
set.add(e1);
}
}