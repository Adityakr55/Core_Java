package com.JSP.Object;

class Car{
	static String brandname;
	String carname;
	String color;
	double price;
	int carnum;
	
	public void display()
	{
		System.out.println(brandname);
		System.out.println(carname);
		System.out.println(color);
		System.out.println(price);
		System.out.println(carnum);
	}
}

public class CarDriver {
	public static void main(String[] args)
	{
		Car c1 = new Car();
		c1.brandname = "Maruti";
		c1.carname = "Baleno";
		c1.color = "white";
		c1.price = 950000;
		c1.carnum = 1525;
		
		c1.display();
		
		System.out.println("======================");
		
		Car c2 = new Car();
		c2.brandname = "Mahindra";
		c2.carname = "Thar";
		c2.color = "Black";
		c2.price = 1850000;
		c2.carnum = 4525;
		c2.display();
		
		 
		System.out.println("=======================");
		
		Car c3 = new Car();
		c3.display();
		
		System.out.println("======================");
		
		Car c4 = new Car();
		c4.carname = "Dezire";
		c4.color = "white";
		c4.price = 950000;
		c4.carnum = 7625;
		
		c4.display();
		
	}

}
