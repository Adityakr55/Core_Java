package com.ConsChaining;

class Phone{
	String name;
	String color;
	
	public Phone(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
}

class SmartPhone extends Phone{
	int ram;
	int rom;
	int pixel;
	
	public SmartPhone(String name,String color,int ram,int rom ,int pixel)
	{
		super(name,color);
		this.ram = ram;
		this.rom = rom;
		this.pixel = pixel;
	}
	
	public void display()
	{
		System.out.println(name +"\n"+color+"\n"+ram+"\n"+rom+"\n"+pixel);
	}
}

public class PhoneDriver {
	public static void main(String[] args)
	{
		SmartPhone s = new SmartPhone("Motorola","White",8,128,48);
		s.display();
	}
}
