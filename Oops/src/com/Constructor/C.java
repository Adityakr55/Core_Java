package com.Constructor;

public class C {
	int i;
	int j;
	
	C(int a,int b)
	{
		i = a;
		j = b;
	}
	
	public void display()
	{
		System.out.println(i+"\n"+j);
	}
	
	public static void main(String[] args)
	{
		C a1 = new C(10,20);
		a1.display();
		
		System.out.println("===================");
		C a2 = new C(30,40);
		a2.display();
	}
}
