package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.saving;

public class AccountMainV4 {
public static void main(String[] args) {
	int AccountNumber;
	String name;
	//int choice;
	String again;
	double balance;
	boolean issalary;
	do {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter ur name");
	
	name=sc.nextLine();
	System.out.println("enter ur balance");
	balance=sc.nextDouble();
	System.out.println("enter ur account namber");
	AccountNumber=sc.nextInt();
	saving account4=new saving(AccountNumber, name, balance, issalary);
	System.out.println(account4);
	System.out.println("menu");
	System.out.println("choise:1=withdrow");
	System.out.println("choice:2=deposite");
	System.out.println("choice:3=view balance");
	System.out.println("enter ur choise");
	int choice;
	choice=sc.nextInt();
switch(choice) {
case 1 :
	System.out.println("enter ur withdrow amount");
	int at;
	at=sc.nextInt();
	account4.withdrow(at);
System.out.println("withdroe succesfully");
System.out.println("balance is:"+ account4.getBalance());
	break;
case 2:
	System.out.println("enter amount to deposite");
int dAt;
dAt=sc.nextInt();
account4.deposit(dAt);
        if(account4.deposit(dAt)) {
	         System.out.println("transiction sussesfully....!");
	         System.out.println("balance is:"+ account4.getBalance());
}     
         else {
	System.out.println("failed....!");
}
	break;
case 3 :
	     System.out.println("ur balance is::"+account4.getBalance());
	
	break;
	
}
		
		
			System.out.println("do u want to oopen salary account(true|false)...?");
			again=sc.next();
	//
	}while(again.equals("true"));
	
	
}



}

