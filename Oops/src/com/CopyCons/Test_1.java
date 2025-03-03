package com.CopyCons;

class Emp{
	String name;
	int age;
	int Id;
	long mobileno;
	int sal;
	
	public Emp()
	{
		
	}
	
	public Emp(String name,int age,int Id,long mobileno,int sal)
	{
		this.name = name;
		this.age = age;
		this.Id = Id;
		this.sal = sal;
		this.mobileno = mobileno;
	}
	
	public Emp(Emp a)
	{
		this.name = a.name;
		this.age = a.age;
		this.Id = a.Id;
		this.mobileno = a.mobileno;
		this.sal =a.sal;
	}
	public Emp(Aditya a)
	{
		this.name = a.name;
		this.age = a.age;
		this.Id = a.Id;
		this.mobileno = a.mobileno;
		this.sal =a.sal;
	}
}

class Aditya{
	String name;
	int age;
	int Id;
	long mobileno;
	int sal;
	
	
	Aditya(String name,int age,int Id,long mobileno,int sal){
		this.name = name;
		this.age = age;
		this.Id = Id;
		this.sal = sal;
		this.mobileno = mobileno;
	}
}

public class Test_1 {
	public static void main(String[] args) {
		Emp a1 = new Emp("Ram",25,11,5376433344l,45333);
		Emp a2 = new Emp();
		Aditya a = new Aditya("Aditya",23,22,323232323,4323);
		Emp a3 = new Emp(a1);
		Emp a4 = new Emp(a2);
		
		Emp a5 = new Emp(a);
		
		
		
		System.out.println(a1.name+"\n"+a1.age+"\n"+a1.Id+"\n"+a1.mobileno+"\n"+a1.sal);
		System.out.println(a2.name+"\n"+a2.age+"\n"+a2.Id+"\n"+a2.mobileno+"\n"+a2.sal);
		System.out.println(a3.name+"\n"+a3.age+"\n"+a3.Id+"\n"+a3.mobileno+"\n"+a3.sal);
		System.out.println(a4.name+"\n"+a4.age+"\n"+a4.Id+"\n"+a4.mobileno+"\n"+a4.sal);
		System.out.println(a5.name+"\n"+a5.age+"\n"+a5.Id+"\n"+a5.mobileno+"\n"+a5.sal);
	}
}
