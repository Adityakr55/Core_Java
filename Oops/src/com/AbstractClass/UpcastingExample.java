package com.AbstractClass;

abstract class Abs1{
	abstract void m1();
}

abstract class Abs2 extends Abs1{
	abstract void m2();
	
	@Override
	abstract void m1();
}

class Abs3 extends Abs2{
	@Override
	public void m1()
	{
		System.out.println("Abs1-3");
	}
	@Override
	public void m2()
	{
		System.out.println("Abs2-3");
	}
}
public class UpcastingExample {
	public static void main(String[] args) {
		Abs2 a = new Abs3();
		Abs1 b = a;
		b.m1();
		a.m2();
	}
	
}
