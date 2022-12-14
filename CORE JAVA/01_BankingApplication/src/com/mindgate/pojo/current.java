package com.mindgate.pojo;

public class current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public current() {
		// TODO Auto-generated constructor stub
	}

	public current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdrow(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && amount > getBalance() && amount < getBalance() + overdraftBalance) {
			amount = amount - getBalance();
			setBalance(0);
			overdraftBalance = overdraftBalance - amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if (overdraftBalance < initialOverdraftBalance) {
				double difference = 
					initialOverdraftBalance - overdraftBalance;
				if (difference < amount) {
					amount = amount - difference;
					overdraftBalance = initialOverdraftBalance;
					setBalance(getBalance() + amount);
					return true;
				} else {
					overdraftBalance 
								= overdraftBalance + amount;
					return true;
				}
			} else {
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

}


