package com.String;

import java.util.Scanner;

public class StringToIntegerWithoutParseInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		int l = s.length(),sum = 0;
		System.out.println("Integer is: "+strToInt(s,l,0,sum));
		// System.out.println("Ingeger is: "+Integer.parseInt(s)); // with parseInt.
		
		sc.close();
	}
	
	private static int strToInt(String s,int l,int i,int sum)
	{
		if(i==l) return sum;
		sum = sum*10 + s.charAt(i) - '0';
		return strToInt(s,l,i+1,sum);
	}
}
