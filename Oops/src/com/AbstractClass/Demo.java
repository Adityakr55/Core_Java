package com.AbstractClass;

abstract class D{
	int i = 10;
	int j = 20;
	
	public void m1() {
		System.out.println("M1()-D");
	}
	
	abstract void m2();
	
	D(){
		System.out.println("D()-cons");
	}
}


class E extends D{
	int i = 30;
	int j = 40;
	
	E()
	{
		System.out.println("E()-cons");
	}
	
	@Override
	void m2()
	{
		System.out.println("M2()-E");
	}
}
public class Demo {
	public static void main(String[] args)
	{
		D d = new E();
		System.out.println(d.i+" "+d.j); // 10 20 b/c variables are early binded.
		d.m1();
		d.m2();
	}
}
