package com.toString;

import java.util.Scanner;

public class MissingVowelCharacterInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = "aeiouAEIOU";
		
		for(int i = 0;i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			if(!s1.contains(ch+""))
			{
				System.out.print(ch);
			}
		}
		sc.close();
	}
}
