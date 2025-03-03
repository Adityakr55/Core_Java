package com.ExceptionHandling;

public class Test5 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		try {
			System.out.println(a[2]/0);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
