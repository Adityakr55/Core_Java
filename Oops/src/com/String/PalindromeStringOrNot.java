package com.String;

import java.util.Scanner;

public class PalindromeStringOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		int l = s.length();
		int st = 0;
		int end = l-1;
		
		if(isPalindrome(s,st,end))
		{
			System.out.println(s+" is a palindrome string.");
		}
		else
		{
			System.out.println(s+" is not a palindrome string.");
		}
		
		sc.close();
	}
	
	protected static boolean isPalindrome(String s,int st,int end)
	{
		if(st>=end) return true;
		
		if(s.charAt(st) != s.charAt(end))
		{
			return false;
		}
		return isPalindrome(s,st+1,end-1);
	}
}
