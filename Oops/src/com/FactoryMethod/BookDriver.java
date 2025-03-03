package com.FactoryMethod;

public class BookDriver {
	public static void main(String[] args)
	{
		Book b1 = Book.createBook();
//		Book b2 = Book.createBook();
		
		b1.display();
		System.out.println("==========");
//		b2.display();
	}
}
