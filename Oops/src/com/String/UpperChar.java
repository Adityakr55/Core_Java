package com.String;

import java.util.Scanner;

public class UpperChar {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the characters: ");
		String s = sc.next();
		
		String res = "";
		
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <='Z')
			{
				res +=ch;
			}
			
		}
		
		System.out.println(res);
		
		sc.close();
	}
}
