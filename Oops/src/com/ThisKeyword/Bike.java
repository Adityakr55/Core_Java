package com.ThisKeyword;

class Test {
	String name;
	int bikenum;
	String color;
	int cc;
	
	public void addBike(String n, int b,String c,int d)
	{
		name = n;
		bikenum = b;
		color = c;
		cc = d;
	}
	
	public void display()
	{
		System.out.println(name + "\n" + bikenum +"\n" + color +"\n"+cc);
	}
}

public class Bike{
	public static void main(String[] args)
	{
		Test b1 = new Test();
		b1.addBike("R15", 4321, "Red", 250);
		b1.display();
		
		System.out.println("=======================");
		
		Test b2 = new Test();
		
		b2.addBike("Rx100", 6474, "White", 100);
		b2.display();
	}
}
