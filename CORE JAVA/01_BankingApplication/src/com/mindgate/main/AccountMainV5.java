package com.mindgate.main;

import com.mindgate.pojo.current;

public class AccountMainV5 {
	public static void main(String[] args) {
		current current = new current(101, "VIvek Gohil", 10000, 50000);

		System.out.println("Withdraw : 5000");
		current.withdrow(5000);
		System.out.println("Withdraw : 5000");
		current.withdrow(5000);
	System.out.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());
		// balance : 5000 overdraft : 50000

		System.out.println();
		System.out.println("Withdraw : 15000");
		current.withdrow(15000);
		System.out
				.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());
		// balance : 0 overdraft : 40000

		System.out.println();
		System.out.println("Deposit : 5000");
		current.deposit(5000);
		System.out
				.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());
		// balance : 0 overdraft : 45000

		System.out.println();
		System.out.println("Deposit : 10000");
		current.deposit(10000);
		System.out.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());
		System.out
				.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());
		// balance : 5000 overdraft : 50000

		System.out.println();
		System.out.println("Withdraw : 15000");
		current.withdrow(15000);
		System.out
				.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());
		// balance : 0 overdraft : 40000

		System.out.println();
		System.out.println("Deposit : 5000");
		current.deposit(5000);
		System.out
				.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());
		// balance : 0 overdraft : 45000

		System.out.println();
		System.out.println("Deposit : 10000");
		current.deposit(10000);
		System.out
				.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());
		// balance : 5000 overdraft : 50000
	}
}