package com.Interface_1;

public interface Washable {
	// Marker interface
}

class Car implements Washable{
	
}

class Mobile{
	
}

class Laptop{
	
}

class Bike implements Washable{
	
}

class Washerman{
	static void wash(Object o) {
		if(o instanceof Washable)
		{
			System.out.println(o.getClass().getSimpleName()+ " is Washed");
		}
		else
		{
			System.out.println(o.getClass().getSimpleName()+ " is not Washed");
		}
	}
}