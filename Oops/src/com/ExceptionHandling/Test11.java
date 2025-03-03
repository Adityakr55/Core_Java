package com.ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test11 {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			m1();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("Handled");
		}
		System.out.println("Main ends");
	}
	
	public static void m1() throws FileNotFoundException, ClassNotFoundException
	{
		System.out.println("M1() starts");
		
		FileReader f = new FileReader("/Users/aditya/jspider/java/basics/Adity.class");
		System.out.println("Reading data");
		System.out.println("M1() ends");
	}
}
