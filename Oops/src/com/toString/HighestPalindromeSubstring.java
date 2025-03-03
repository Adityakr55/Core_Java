package com.toString;
import java.util.Scanner;

public class HighestPalindromeSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int len = 0;
		int startIndex = 0;
		int endIndex = 0;
		
		for(int i = 0;i<s.length();i++)
		{
			for(int j = i+2;j<=s.length();j++)
			{
				String str = s.substring(i,j);
				if(isPalindrome(str))
				{
					int curlen = str.length();
					if(curlen == s.length()) continue;
					if(curlen>len)
					{
						len = curlen;
						startIndex = i;
						endIndex = j;
					}
				}
			}
			
		}
		System.out.println(s.substring(startIndex,endIndex));
	}
	
	public static boolean isPalindrome(String str)
	{
		int i = 0;
		int j = str.length()-1;
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
