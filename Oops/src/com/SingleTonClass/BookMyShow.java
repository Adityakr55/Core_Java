package com.SingleTonClass;

public class BookMyShow {
	public static void main(String[] args)
	{
		Theater t1 = Theater.getIns();
		t1.bookTicket(5);
		
		Theater t2 = Theater.getIns();
		t1.bookTicket(15);
		
		Theater t3 = Theater.getIns();
		t3.bookTicket(31);
	}
}
