package com.Cloning;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Person p1 = new Person("Jack",26,new Address("Bangalore","India"));
		Person p2 = (Person)p1.clone();
		
		System.out.println(p1);
		System.out.println(p2);
		p2.address.city = "Hyderabad";
		
		System.out.println("================");
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
