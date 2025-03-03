package com.Upcasting;

class AA extends Object {
	
}

class BB extends AA{
	
}

class CC{
	
}

class DD{
	
}

public class Test1 {
	public static void m1(Object o)
	{
		System.out.println("M1 is executed");
	}
	
	public static void main(String[] args)
	{
		m1(10); // b/c Object class is the supermost class of every class(here autoboxing occur java.lang.Integer -> java.lang.Number -> java.lang.Object).
		m1(new AA());
		m1(new BB());
		m1(new CC());
		m1(new DD());
	}
}
