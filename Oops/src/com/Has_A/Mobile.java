package com.Has_A;

public class Mobile {
	String mobileName;
	int ram;
	int rom;
	String color;
	Sim s;
	
	public Mobile(String mobileName,int ram,int rom,String color)
	{
		this.mobileName = mobileName;
		this.ram = ram;
		this.rom = rom;
		this.color = color;
	}
	
	public void insertSim(Sim s)
	{
		this.s = s;
	}
	
	public void displayMobile()
	{
		System.out.println(mobileName);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(color);
		
		if(s != null)
			s.display();
		else
			System.out.println("No sim card inserted.");
	}
}
