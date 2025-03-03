package com.ExceptionHandling;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		String s = null;
		
		try {
			System.out.println("Outer try block");
			System.out.println(10/5);
			// System.out.println(10/0);
			try {
				System.out.println("Inner try block");
				System.out.println(s.length());
			}
			catch(ArithmeticException e) {
				System.out.println("Inner Catch block");
				System.out.println(e);
			}
		}
		catch(NullPointerException | ArithmeticException e) {
			System.out.println("Outer Catch block");
			System.out.println(e);
		}
		System.out.println("Main ends");
	}
}
