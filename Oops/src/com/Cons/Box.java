package com.Cons;

public class Box {
		
	int length;
	int breadth;
	int height;
	
	Box(){
		
	}
	
	Box(int n)
	{
		length = n;
		breadth = n;
		height = n;
	}
	
	Box(int length,int breadth,int height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public void display()
	{
		System.out.println("Length: "+length+"\n"+"Breadth: "+breadth+"\n"+"Height: "+height);
	}
	
	public static void main(String[] args)
	{
		Box b1 = new Box();
		b1.display();
		
		Box b2 = new Box(5);
		b2.display();
		
		Box b3 = new Box(5,10,15);
		b3.display();
	}
	
}
