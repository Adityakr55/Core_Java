package com.Has_A;

public class Car {
	String name;
	int carNum;
	String color;
	Engine e;
	
	public Car(String name,int carNum,String color,Engine e)
	{
		this.name = name;
		this.carNum = carNum;
		this.color = color;
		this.e = e;
	}
	
	public void displayCar()
	{
		System.out.println(name);
		System.out.println(carNum);
		System.out.println(color);
		e.display();
	}
}
