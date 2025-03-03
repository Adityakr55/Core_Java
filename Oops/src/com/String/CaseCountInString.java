package com.String;

import java.util.Scanner;

public class CaseCountInString {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		
		int l = s.length();
		int uc = 0,lc = 0,sp = 0,no = 0;
		for(int i = 0;i<l;i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				uc++;
			}
			else if( ch >= 'a' && ch <= 'z')
			{
				lc++;
			}
			else if(ch >= '0' && ch <= '9')
			{
				no++;
			}
			else
			{
				sp++;
			}
		}
		
		System.out.println("Upper: "+uc+"\nLower: "+lc+"\nSpecial: "+sp+"\nNumber: "+no);
		
		sc.close();
	}
}
