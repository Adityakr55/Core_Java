package com.ExceptionHandling;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(10/0.0); // Infinity (IEEE 754 standard)
		System.out.println(50%0.0); // NaN (IEEE 754 standard)
		System.out.println(25/0); // A.E(Exception)
	}
}
