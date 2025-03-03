package com.Cloning;

public class Person implements Cloneable {
	String name;
	int age;
	long mobile;
	Address address;
	
	public Person(String name,int age,Address address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return "[name = "+name+",age = "+age+",Address = "+address+"]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		// shallow cloning
  		// return super.clone(); 
		
		// deep cloning
		Person p = (Person)super.clone();
		p.address =(Address)address.clone();
		return p;
	}
}
