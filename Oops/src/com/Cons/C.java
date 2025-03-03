package com.Cons;

public class C {
	int k;
	C(){
		System.out.println("C()cons");
	}
	
	C(int i){
		this();
		k = 20;
		System.out.println("C(int i)cons");
	}
	
	C(int i,int j)
	{
		this(10);
		System.out.println("C(int i,int j)cons");
		System.out.println(k);
	}
	
	public static void main(String[] args)
	{
		new C(5,10);
	}
}
