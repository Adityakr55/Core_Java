package com.JSP.Object;
import java.util.Scanner;

public class Circle {
	int r;
	
	public static void main(String[] args)
	{
		Circle obj = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius of circle: ");
		obj.r = sc.nextInt();
		Circle c = obj;
		System.out.println(obj.r);
		System.out.println(c.r);
		
		sc.close();
	}
}
