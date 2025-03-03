package com.ThisKeyword;

class Rectangle{
	
	int length;
	int breadth;
	
	void initialize(int length, int breadth)
	{
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() {
		System.out.println(length*breadth);
		System.out.println(this.length*this.breadth);
	}
	
	public void periMeter() {
		System.out.println(2*(this.length + this.breadth));
		System.out.println(2*(length + breadth));
	}
	
	public void display()
	{
		System.out.println("lenght:"+length +"\n" + "Breadth:"+breadth);
	}
}

public class RectangleDriver {
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		
		r.initialize(10, 5);
		r.getArea();
		r.periMeter();
		r.display();
	}
}
