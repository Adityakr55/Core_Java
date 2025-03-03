package com.Upcasting;

class Vehicle{
	
}

class BMW extends Vehicle{
	
}

class BMWX extends BMW{
	
}

class BENZ extends Vehicle{
	
}

class AUDI extends Vehicle{
	
}

public class Test {
public static void drive(Vehicle v)
{
	System.out.println("driving...");
}
public static void main(String[] args)
{
	drive(new Vehicle());
	drive(new BMW());
	drive(new BMWX());
	drive(new BENZ());
	drive(new AUDI());
}
}
