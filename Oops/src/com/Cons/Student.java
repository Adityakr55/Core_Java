package com.Cons;

public class Student {
	String name;
	int age;
	int id;
	long mobileno;
	
	
	Student()
	{
		System.out.println("No-args-cons");
	}
	Student(String name)
	{
//		this();
		this.name = name;
		System.out.println("One-args-cons");
	}
	
	Student(String name,int age)
	{
		this(name);
		this.age = age;
		System.out.println("Two-args-cons");
	}
	
	Student(String name,int age,int id)
	{
		this(name,age);
		this.id =  id;
		System.out.println("Three-args-cons");
	}
	
	Student(String name,int age,int id,long mobileno)
	{
		this(name,age,id);
		this.mobileno = mobileno;
		System.out.println("Four-args-cons");
	}
	
	public void display()
	{
		System.out.println("Name: "+name+"\n"+"Age: " +age+"\n"+"Id: "+id+"\n"+"Mobile No: "+mobileno);
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student("Aditya",22,01,1839487374);
		s1.display();
	}
}
