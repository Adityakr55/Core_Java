package com.JSP.Object;

public class B {
	int i;
	static int j;
	
	void increment()
	{
		i++;
		j++;
	}
	
	public void display()
	{
		System.out.println(i+","+j);
	}
	
	public static void main(String[] args)
	{
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		
		b1.increment();
		b2.increment();
		b3.increment();
		
		b1.display();
		b2.display();
		b3.display();
	}

}
