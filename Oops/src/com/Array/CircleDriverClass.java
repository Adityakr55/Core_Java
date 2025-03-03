package com.Array;

class Circle{
	int radius;
	
	Circle(int r){
		radius = r;
	}
	
	public String toString() {
		return "Circle [ radius = " +radius+" ]";
	}
}

public class CircleDriverClass {

	public static void main(String[] args) {
		Circle[] arr = new Circle[4];
		
		arr[0] = new Circle(4);
		arr[1] = new Circle(5);
		arr[2] = new Circle(6);
		arr[3] = new Circle(7);
		
		for(Circle c:arr) {
			System.out.println(c);
		}

	}

}
