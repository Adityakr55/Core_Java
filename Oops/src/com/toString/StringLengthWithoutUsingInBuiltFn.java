package com.toString;
import java.util.Scanner;

public class StringLengthWithoutUsingInBuiltFn {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.nextLine();
		Scanner sc = new java.util.Scanner(str);
		
		sc.useDelimiter(" ");
		int count = 0;
		while(sc.hasNext())
		{
			sc.next();
			count++;
		}
		System.out.println(count);
	}
}
