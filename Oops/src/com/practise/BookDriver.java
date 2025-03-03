package com.practise;

public class BookDriver {

	public static void main(String[] args) {
		FactoryMethod f1 = FactoryMethod.createObject();
		FactoryMethod f2 = FactoryMethod.createObject();
		
		f1.display();
		System.out.println("===========");
		f2.display();
	}

}
