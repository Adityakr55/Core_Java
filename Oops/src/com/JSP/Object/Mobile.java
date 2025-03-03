package com.JSP.Object;

public class Mobile {
	String name;
	int ram;
	int rom;
	String color;
	double price;
	// states of an Object
	
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		
		m1.name = "Apple";
		m1.ram = 4;
		m1.rom = 128;
		m1.color = "White";
		m1.price = 39000;
		
		System.out.println(m1.name + "\n" +m1.ram + "\n"+ m1.rom + "\n" + m1.color + "\n" + m1.price);
		System.out.println("============================");
		System.out.println(m2.name + "\n" +m2.ram + "\n"+ m2.rom + "\n" + m2.color + "\n" + m2.price);
	}
}
