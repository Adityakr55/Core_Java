package com.toString;
import java.util.Scanner;

public class OccuranceOfEachCharUsingReplaceMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		while(s.length() != 0)
		{
			char ch = s.charAt(0);
			String s2 = s.replace(ch+"","");
			System.out.println(ch+"="+(s.length()-s2.length()));
			s = s2;
		}
		
		sc.close();
	}
}
