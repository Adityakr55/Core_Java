package com.Upcasting;

class Animal{
	
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}

class Babydog extends Dog{
	
}

public class Demo {
	
	public static Animal m1()
	{
		//return new Animal(); // CTS
		// return new Dog();
		// return new Babydog();
		return new Cat();
		
	}
	
	public static Dog m2()
	{
		// return new Animal();// CTE
		// return new Dog();
		// return new Cat();// CTE
		return new Babydog();
		
	}
	public static void main(String[] args)
	{
		
	}
}
