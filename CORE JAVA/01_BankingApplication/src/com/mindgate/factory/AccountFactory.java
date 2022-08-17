package com.mindgate.factory;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.current;
import com.mindgate.pojo.saving;

public class AccountFactory {
public Account getAccount(int choice)
{
	
if (choice ==1) {
	return new saving();
	
}
if(choice==2)
{
	return new current();
	
}
return null;
}
}