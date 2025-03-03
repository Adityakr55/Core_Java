package com.String;

import java.util.Scanner;
public class VowelCharacterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		
		s = s.toUpperCase();
		
		int l = s.length(),count = 0;
		
		for(int i = 0;i<l;i++)
		{
			char c = s.charAt(i);
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'u')
			{
				count++;
			}
				
		}
		System.out.println("No of vowel: "+count);
		
		sc.close();
	}
}
