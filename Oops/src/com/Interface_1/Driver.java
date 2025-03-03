package com.Interface_1;

public class Driver {
	public static void main(String[] args)
	{
		Bike b = new Bike();
		Car c = new Car();
		Laptop l = new Laptop();
		Mobile m = new Mobile();
		
		Washerman.wash(b);
		Washerman.wash(c);
		Washerman.wash(l);
		Washerman.wash(m);
	}
}
