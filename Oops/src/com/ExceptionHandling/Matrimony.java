package com.ExceptionHandling;

public class Matrimony {
	public static void main(String[] args) {
		int age = 45;
		if(age >= 25 && age <= 35)
		{
			System.out.println("Eligible");
		}
		else
		{
			AgeInvalidException a = new AgeInvalidException();
			throw a;
		}
	}
}
