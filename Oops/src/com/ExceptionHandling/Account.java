package com.ExceptionHandling;

public class Account {
	int bal;
	public Account(int bal)
	{
		this.bal = bal;
	}
	
	public void withdraw(int amount) throws InsufficientBalException{
		if(amount >bal)
		{
			throw new InsufficientBalException();
			//throw new InsufficientBalException("low bal");
		}
		bal = bal - amount;
		System.out.println(amount +"Withdraw done");
		System.out.println("Available bal:"+bal);
	}
}
