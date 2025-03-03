package com.ObjectClass;

public class B {
	int i;
	int j;
	
	public B(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	 
	 @Override
	 public boolean equals(Object o)
	 {
		 B b = (B)o;
		 return this.i == b.i && this.j == b.j;
	 }
	 
	 public static void main(String[] args)
	 {
		 B b1 = new B(10,20);
		 B b2 = new B(10,20);
		 
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b1 == b2);
		 System.out.println(b1.equals(b2));
	 }
}
