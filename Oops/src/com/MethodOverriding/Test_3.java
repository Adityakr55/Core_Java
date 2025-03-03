package com.MethodOverriding;

class Animal{
	void sound()
	{
		System.out.println("Animal sound");
	}
}

class Dog extends Animal{
	@Override
	void sound()
	{
		System.out.println("Dog is barking");
	}
}

 class BabyDog extends Dog{
	@Override
	void sound()
	{
		System.out.println("Weeping sound");
	}
}

class Cat extends Animal{
	@Override
	void sound()
	{
		System.out.println("Meow");
	}
}

public class Test_3 {
	public static void main(String[] args)
	{
		BabyDog b = new BabyDog();
		b.sound();
		Cat c = new Cat();
		c.sound();
	}
}
