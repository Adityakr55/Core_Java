package com.ObjectClass;

public class Emp {
	String name;
	int age;
	int empid;
	long mobileNo;
	double sal;
	
	public Emp(String name,int age,int empid,long mobileNo,double sal)
	{
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.mobileNo = mobileNo;
		this.sal = sal;
	}
	
	@Override
	public String toString()
	{
		return name+" "+ age + " " + empid + " " + mobileNo + " "+ sal;
	}
	
	public static void main(String[] args)
	{
		Emp e1 = new Emp("Aditya",22,101,8983848443l,484489.50);
		System.out.println(e1);
		Emp e2 = new Emp("Kishor",31,222,9894848383l,848383);
		System.out.println(e2);
	}
}

