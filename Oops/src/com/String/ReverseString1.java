package com.String;

import java.util.Scanner;

public class ReverseString1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		
		int l = s.length();
		String res = "";
		for(int i = l-1;i>=0;i--)
		{
			res +=s.charAt(i);
		}
		System.out.print(res);
		
		
		
		String s1 = "Aditya";
		String s2 = s1;
		
		String s3 = new String("Aditya");
		String s4 = new String("Aditya");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		sc.close();
	}
}
