package com.toString;
import java.util.Scanner;

public class SmallestPalindromeSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int len = s.length();
		int startIndex = 0;
		int endIndex = 0;
		
		for(int i = 0;i<s.length();i++)
		{
			for(int j = i+2;j<=s.length();j++)
			{
				String str = s.substring(i,j);
				if(isPalindrome(str))
				{	
					int minlen = str.length();
					if(minlen<len)
					{
						len = minlen;
						startIndex = i;
						endIndex = j;
					}
				}
			}
		}
		System.out.println(s.substring(startIndex,endIndex));
	}
	
	public static boolean isPalindrome(String s)
	{
		int i = 0;
		int j = s.length()-1;
		while(i<j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
