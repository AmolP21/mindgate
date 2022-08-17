package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.AccountFactory;
import com.mindgate.pojo.Account;
import com.mindgate.pojo.current;
import com.mindgate.pojo.saving;

public class AccountMainV7 {
 public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	AccountFactory accountfactory= new AccountFactory();
	
	System.out.println("case1: saving");
	System.out.println("case2: current");
	System.out.println("enter ur choice");
	
	int choice=scan.nextInt();
	Account account =accountfactory.getAccount(choice);

	if(account instanceof saving )
 System.out.println("saving object created");
	if(account instanceof current)
		System.out.println("current object created");
 }}