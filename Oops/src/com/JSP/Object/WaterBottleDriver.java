package com.JSP.Object;

class WaterBottle {
	String name;
	int size;
	String color;
	double price;
	String type;
	
	boolean water;
	
	public void drinkwater()
	{
		if(water) {
			System.out.println("Drinking water...");
			water =false;
		}
		else {
			System.out.println("Fill water");
		}
	}
	
	public void fillwater()
	{
		water = true;
	}
}

public class WaterBottleDriver{
		public static void main(String[] args) {
			WaterBottle w1 = new WaterBottle();
			w1.name = "Milton";
			w1.color = "White";
			w1.price = 500;
			w1.type = "Plastic";
			w1.water = true;
			
			w1.drinkwater();
			w1.drinkwater();
			w1.fillwater();
			w1.drinkwater();
		}
	}

