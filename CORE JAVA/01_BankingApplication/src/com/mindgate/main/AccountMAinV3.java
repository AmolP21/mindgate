package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountMAinV3 {
	public static void main(String[] args) {
		int AccountNumber;
		String name;
		int choice;
		String again;
		do {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter ur name");
		
		name=sc.nextLine();
		
		System.out.println("enter ur account namber");
		AccountNumber=sc.nextInt();
		Account account3=new Account(AccountNumber,name, 50000);
		System.out.println(account3);
		System.out.println("menu");
		System.out.println("choise:1=withdrow");
		System.out.println("choice:2=deposite");
		System.out.println("choice:3=view balance");
		System.out.println("enter ur choise");
		choice=sc.nextInt();
	switch(choice) {
	case 1 :
		System.out.println("enter ur withdrow amount");
		int at;
		at=sc.nextInt();
		account3.withdrow(at);
	System.out.println("withdroe succesfully");
	System.out.println("balance is:"+ account3.getBalance());
		break;
	case 2:
		System.out.println("enter amount to deposite");
	int dAt;
	dAt=sc.nextInt();
	account3.deposit(dAt);
	        if(account3.deposit(dAt)) {
		         System.out.println("transiction sussesfully....!");
		         System.out.println("balance is:"+ account3.getBalance());
	}     
	         else {
		System.out.println("failed....!");
	}
		break;
	case 3 :
		     System.out.println("ur balance is::"+account3.getBalance());
		
		break;
		
	}
			
			
				System.out.println("do u want to continuess...?");
				again=sc.next();
		//
		}while(again.equals("yes"));
		
		
	}

}
