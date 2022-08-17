package com.mindgate.pojo;

public class saving extends Account {
private boolean isSalary;
public saving() {
	
}
public saving(int accountNumber, String name, double balance, boolean isSalary) {
	super(accountNumber, name, balance);
	this.isSalary = isSalary;
}
@Override
	public boolean withdrow(double amount) {
		if(isSalary) {
			if(amount > 0 && getBalance()>=amount ) {
				setBalance(getBalance()-amount);
				return true;
			}
		}
		return false;
	}
@Override
	public boolean deposit(double amount) {
	setBalance(getBalance()+amount);
	
		return false;
	}
}
