package com.Has_A;

public class CarDriver {
	public static void main(String[] args)
	{
		Car c1 = new Car("Mercedes",1111,"Black",new Engine(5000,"Petrol"));
		c1.displayCar();
		
		c1.e.type = "Diesel";
		c1.displayCar();
	}
}
