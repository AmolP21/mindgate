package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		System.out.println("this is account mainV2");
		Account account=new Account(101,"test",100000);
		System.out.println("withdrow::500");
		boolean result =account.withdrow(500);
		if(account.withdrow(500))
				System.out.println("transictiopn susses.....!");
		else
			System.out.println("transictionn failed somthing wrong.....!");
		System.out.println("balance is::"+account.getBalance());
	}
}

//boo