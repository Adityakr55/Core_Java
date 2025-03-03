package com.Has_A;

public class Sim {
	String name;
	long num;
	
	public Sim(String name,long num)
	{
		this.name = name;
		this.num = num;
	}
	
	public void display()
	{
		System.out.println("Sim card name: "+name);
		System.out.println("Sim card num: "+num);
	}
}
