package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountName {
public static void main(String[] args) {
	System.out.println("hello world");
	Account account = new Account();
	account.setAccountNumber(101);
	account.setName("amol pawar");
	account.setBalance(1000);
account.getAccountNumber();
	account.getName();
	account.getBalance();
	Account account2 =new Account(102,"raj", 43562);
	System.out.println(account2.getAccountNumber());
	System.out.println(account2.getName());
	System.out.println(account2.getBalance());
	System.out.println(account2);
	
}
}
