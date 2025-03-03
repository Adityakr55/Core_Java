package com.Interface;

interface Regulator{
	void increaseSpeed();
	
	void decreaseSpeed();
}

interface Switch{
	void on();
	
	void off();
}

 class Fan implements Regulator,Switch{
	@Override
	public void increaseSpeed()
	{
		System.out.println("Speed increasing...");
	}
	
	@Override
	public void decreaseSpeed()
	{
		System.out.println("Speed decreasing...");
	}
	
	@Override
	public void on()
	{
		System.out.println("Fan is ON");
	}
	
	@Override
	public void off()
	{
		System.out.println("Fan is Off");
	}
}

public class DriverFan {
	public static void main(String[] args)
	{
		Regulator r = new Fan();
		r.increaseSpeed();
		r.decreaseSpeed();
		// r.on(); // CTE
		// r.off(); // CTE
		
		Switch s = new Fan();
		s.on();
		s.off();
		
		// s.increaseSpeed(); // CTE
		// s.decreaseSpeed(); // CTE
	}

}
