package com.mindgate.pojo;

import java.util.Scanner;
import java.util.*;

public class Calculation {
private int num1;
private int num2;
private int num3;
int result;

public void accept() {
	Scanner scanner = null;
	try {
	Scanner sc =new Scanner(System.in);
	System.out.println("enteer 1-num 1");
	int num1=sc.nextInt();
	
	System.out.println("enteer 1-num 1");

	int num2 =sc.nextInt();
	
	System.out.println("enteer 1-num 1");
 int num3=sc.nextInt();
 System.out.println("enter the number");
int number=sc.nextInt();
}

	catch(InputMismatchException e) {
		System.out.println("Invalied input");
	}
		finally {
			scanner.close();
		}
	}
public void calculate() {
	System.out.println("In calculate");
	 int result = num1 + num2;
}

public void display() {
	System.out.println("Result is :" +result);
}
}

