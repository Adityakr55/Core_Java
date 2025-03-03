package com.ExceptionHandling;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			System.out.println(10/0);  //ArithmeticException a = new ArithmeticException("/ by zero");
										//throw a; // but here it is done by JVM automatically 
			System.out.println("Try-block");
		}
		catch(ArithmeticException e){
			System.out.println("Handled");
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		System.out.println("Main ends");
	}

}
