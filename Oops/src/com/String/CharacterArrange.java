package com.String;

import java.util.Scanner;

public class CharacterArrange {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the characters: ");
		String s = sc.next();
		
		String num = "",spec="",lc="",uc="";
		
		int len = s.length();
		for(int i = 0;i<len;i++)
		{
			char ch = s.charAt(i);
			if(ch >= '0' && ch <='9')
			{
				num +=ch;
			}
			else if(ch >= 'a' && ch <= 'z')
			{
				lc +=ch;
			}
			else if(ch >= 'A' && ch <= 'Z')
			{
				uc +=ch;
			}
			else
			{
				spec +=ch;
			}
		}
		
		System.out.println(num+spec+lc+uc);
		sc.close();
	}
}
