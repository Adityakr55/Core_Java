package com.String;

import java.util.Scanner;

public class ReverseCharacterInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		int i = 0;
		int j = 0;
		
		String s2 = "";
		while(j<s.length())
		{
			while(j<s.length() && s.charAt(j) != ' ')
			{
				j++;
				
			}
			
			int k = j - 1;
			while(k >= i)
			{
				s2 += s.charAt(k);
				k--;
			}
			if(j<s.length())
			{
				s2 +=' ';
			}
			j++;
			i=j;
		}
		
		System.out.println(s2);
		
		// input:- Java is easy
		// output:- avaj si ysae
		
		sc.close();
		
	}

}
