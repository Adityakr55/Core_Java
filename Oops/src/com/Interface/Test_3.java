package com.Interface;

interface I4{
	void m1();
	void m1(int i);
}

interface I5 extends I4{
	void m1(int i);
	void m2();
}

class C{
	public void m2() {
		System.out.println("M2()-C");
	}
	
}

class D extends C implements I4,I5{
	@Override
	public void m1()
	{
		System.out.println("M1()-D");
	}

	@Override
	public void m1(int i) {
		System.out.println("M1()-D-"+i);
		
	}
	
}
public class Test_3 {
	public static void main(String[] args)
	{
		I4 d = new D();
		d.m1();
		d.m1(1);
		// d.m2(); // CTE
		
		System.out.println("****************");
		
		I5 e = new D();
		e.m1();
		e.m2();
		e.m1(10);
	}
}
