package com.FactoryMethod;

import java.util.Scanner;

public class Book {
	String name;
	String author;
	double price;
	
	public Book(String name,String author,double price)
	{
		this.name = name;
		this.author= author;
		this.price = price;
	}
	
	public void display()
	{
		System.out.println(name+"\n"+author+"\n"+price);
	}
	
	public static Book createBook()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name: ");
		String name = sc.next();
		System.out.println("Enter author name: ");
		String author = sc.next();
		System.out.println("Enter book price: ");
		double price = sc.nextDouble();
		
		sc.close();
		return new Book(name,author,price);
	}
}
