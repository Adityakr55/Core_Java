package com.Constructor;

public class Rectangle {
	int length;
	int breadth;
	
	public Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void display()
	{
		System.out.println("Length:" + length);
		System.out.println("Breadth:"+ breadth);
	}
	
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(5,10);
		r1.display();
		Rectangle r2 = new Rectangle(15,20);
		r2.display();
	}
}
