package com.toString;

import java.util.Scanner;

public class MinRepeatedCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		int min = s.length();
		char character = '\u0000';
		
		char[] ch = s.toCharArray();
		
		for(int i = 0;i<ch.length;i++)
		{
			int count = 1;
			if(ch[i] == '\u0000')continue;
			for(int j = i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j] = '\u0000';
				}
			}
			if(min>count)
			{
				min = count;
				character = ch[i];
			}
			
			
		}
		System.out.println(character+" occurs min with "+min+" occurance");
		
		sc.close();
	}
}
