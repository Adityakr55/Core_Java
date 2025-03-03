package com.practise;

public class Orrice {
	public static void main(String[] args) {
	     // Vehicle v = new Vehicle(); // ❌ ERROR: Cannot instantiate an abstract class

	     Car car = new Car();
	     car.start(); // ✅ Calls overridden method
	     car.stop();  // ✅ Calls inherited concrete method
	 }
}

//Abstract class
abstract class Vehicle {
 void start() {
	 System.out.println("Aditya");
} // Abstract method (no implementation)
 
 void stop() {  // Concrete method (has implementation)
     System.out.println("Vehicle is stopping...");
 }
}

//Concrete subclass (must implement abstract method)
class Car extends Vehicle {
 @Override
 void start() {
     System.out.println("Car is starting...");
 }
}

