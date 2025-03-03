package com.practise;

import java.util.Scanner;

public class FactoryMethod {
	String name;
	int age;
	int id;
	
	private FactoryMethod(String name,int age,int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void display() {
		System.out.println(this.name +"\n"+this.age+"\n"+this.id);
	}
	
	public static FactoryMethod createObject() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = sc.next();
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		
		return new FactoryMethod(name,age,id);
	}
}
