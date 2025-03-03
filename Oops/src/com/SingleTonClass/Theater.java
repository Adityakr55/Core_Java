package com.SingleTonClass;

public class Theater {
	int seats = 50;
	static private Theater t;
	
	private Theater() {
		
	}
	
	public static Theater getIns()
	{
		if(t == null)
		{
			t = new Theater();
			return t;
		}
		else
		{
			return t;
		}
	}
	
	public void bookTicket(int n)
	{
		if(n<=seats)
		{
			System.out.println(n+"seats is booked");
			seats -=n;
			System.out.println(seats+"seats are left");
		}
		else
		{
			System.out.println(n+"seats is not available");
		}
	}
}
