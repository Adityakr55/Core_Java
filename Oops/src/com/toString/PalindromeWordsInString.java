package com.toString;
import java.util.Scanner;

public class PalindromeWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = sc.nextLine();
		
		findPalindrome(s1);
		
		sc.close();
	}
	
	public static void findPalindrome(String s1)
	{
		String[] str = s1.split(" ");
		for(int i = 0;i<str.length;i++)
		{
			String s = str[i];
			if(isPalindrome(s))
			{
				System.out.println(s);
			}
			
		}
	}
	public static boolean isPalindrome(String s)
	{
		int l = 0;
		int r = s.length() -1;
		while(l<r)
		{
			if(s.charAt(l) != s.charAt(r))
			{
				return false;
			}
			l++;
			r--;
			
		}
		return true;
	}
}
