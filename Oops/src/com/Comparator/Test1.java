package com.Comparator;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		Circle[] arr = new Circle[5];
		
		arr[0] = new Circle(40);
		arr[1] = new Circle(50);
		arr[2] = new Circle(20);
		arr[3] = new Circle(30);
		arr[4] = new Circle(70);
		
		Arrays.sort(arr);
		
		for(Circle c:arr) {
			System.out.println(c);
		}
	}
}
