package com.ObjectClass;

public class Car {
	String name;
	int carnum;
	String color;
	
	public Car(String name,int carnum, String color)
	{
		this.name = name;
		this.carnum = carnum;
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		return "Car[ name = "+name+" , CarNum = "+carnum+" ,color= "+ color+"]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		Car c = (Car)o;
		return this.name.equals(c.name) && this.carnum == c.carnum && this.color.equals(c.color);
	}
	
	public static void main(String[] args)
	{
		Car c1 = new Car("BMW", 4321, "white");
		Car c2 = new Car("BMW", 4321, "white");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1==c2); // false b/c the refrence of c1 and c2 refrence variable in heap area is different.
		System.out.println(c1.equals(c2));
	}
}
