package com.Constructor;

public class A {
	A(){
		System.out.println("A-cons");
	}
	
	public static void main(String[] args)
	{
		new A();
		new A();
		new A();
		
		new D(3);
		// new D(); //CTE  if you have created argumented constructor inside a class
					//     then JVM will not add default no-argumented constructor.
					//		if you want to use no-argumented constructor the you have
					// 		create it.
		
	}
}

class D {
	D(int a){
		System.out.println("D-cons");
	}
}
