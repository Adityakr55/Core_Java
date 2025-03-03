package com.MethodOverriding;

class Bank{
	int rateOfInt() {
		return 0;
	}
}

class SBI extends Bank{
	@Override
	protected int rateOfInt() {
		return 10;
	}
}

class ICICI extends Bank{
	@Override
	public int rateOfInt()
	{
		return 12;
	}
}

class Axis extends Bank{
//	@Override
//	private int rateOfInt()  // cannot reduce visibility of inherited method from Bank.
//	{
//		return 0;
//	}
	
	@Override
	int rateOfInt()
	{
		return 8;
	}
}

public class BankDriver {
	public static void main(String[] args)
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		Axis a = new Axis();
		
		System.out.println("SBI rate of interest is : "+s.rateOfInt());
		System.out.println("ICICI rate of interest is : "+i.rateOfInt());
		System.out.println("Axis rate of interest is : "+a.rateOfInt());
	}
}
