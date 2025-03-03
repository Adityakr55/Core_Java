package com.Has_A;

public class MobileDriver {
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile("Moto",8,128,"white");
		m1.displayMobile();
		
		System.out.println("===================");
		
		m1.insertSim(new Sim("Airtel",7232883507l));
		m1.displayMobile();
		m1.s.name = "Jio";
		m1.displayMobile();

	}
}
