package com.ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			FileReader f = new FileReader("/Users/aditya/jspider/java/basics/Aditya.class");
			System.out.println("Reading data");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Handled");
		}
		
		System.out.println("Main ends");
	}

}
