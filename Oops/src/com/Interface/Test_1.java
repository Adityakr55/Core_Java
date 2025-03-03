package com.Interface;

interface I2{
	void m1();
	
	void m2();

}

interface I3{
	void m1();
	
	void m3();
}

class A implements I2,I3{

	@Override
	public void m1() {
		System.out.println("M1()-A");
		
	}

	@Override
	public void m3() {
		System.out.println("M3()-A");
		
	}

	@Override
	public void m2() {
		System.out.println("M2()-A");
		
	}
	
}
public class Test_1 {
	public static void main(String[] args)
	{
		I2 a = new A();
		a.m1();
		a.m2();
		
		I3 b = new A();
		b.m1();
		b.m3();
		
		A c = new A();
		c.m1();
		c.m2();
		c.m3();
		
	}
}
