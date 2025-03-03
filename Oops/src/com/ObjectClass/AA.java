package com.ObjectClass;

public class AA {
	int i;
	int j;
	
	AA(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString()
	{
		return i+","+j;
	}
	
	public static void main(String[] args)
	{
		AA a1 = new AA(10,20);
		System.out.println(a1.toString());
		
		AA a2 = new AA(30,40);
		System.out.println(a2);
	}
}
