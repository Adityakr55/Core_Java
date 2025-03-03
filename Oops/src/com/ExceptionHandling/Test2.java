package com.ExceptionHandling;

public class Test2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		System.out.println("Main Starts");
		
		try {
			System.out.println(a[7]);
//			throw new ArrayIndexOutOfBoundsException("yha kux gadbad hai "); // this is done by JVM itself in the previous line for runtime exception.
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}
}
