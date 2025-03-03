package com.CopyCons;

class A{
	int i;
	int j;
	
	public A(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	A(A a)
	{
		this.i = a.i;
		this.j = a.j;
	}
}

public class Test {
	public static void main(String[] args)
	{
		A a = new A(10,20);
		A a2 = new A(a); // Copy constructor.
		System.out.println(a.i+"\t"+a.j);
		System.out.println(a2.i+"\t"+a2.j);
	}

}
