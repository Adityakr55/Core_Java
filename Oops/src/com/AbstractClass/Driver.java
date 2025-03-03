package com.AbstractClass;

abstract class Shape{
	String color;
	
	public Shape(String color)
	{
		this.color = color;
	}
	
	abstract public void getArea();
	
	public abstract void display();
}

class Rectangle extends Shape{
	
	int length;
	int breadth;
	
	public Rectangle(String color,int length,int breadth)
	{
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void getArea()
	{
		System.out.println(length*breadth);
	}
	
	@Override
	public void display()
	{
		System.out.println("color :"+color);
		System.out.println("length :"+length);
		System.out.println("breadth :"+breadth);
	}
	
	public void perimeter()
	{
		System.out.println(2*(length + breadth));
	}
	
}

class Circle extends Shape{
	int radius;
	
	public Circle(String color,int radius)
	{
		super(color);
		this.radius = radius;
	}
	
	
	public void getArea()
	{
		System.out.println(3.14*radius*radius);
	}
	
	public void display()
	{
		System.out.println("Color :"+color);
		System.out.println("Radius :"+radius);
	}
}
public class Driver {
	public static void main(String[] args)
	{
		Shape s;
		s = new Rectangle("Red",10,10);
		s.getArea();
		s.display();
		
		//s.perimeter(); // CTE
		
		System.out.println("******************");

		s= new Circle("Blue",20);
		s.getArea();
		s.display();
		
	}
}
