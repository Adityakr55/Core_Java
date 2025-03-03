package com.toString;
import java.util.Scanner;


public class RemoveExtraSpaceInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		s = s.trim();
//
		
		char[] ch = s.toCharArray();
		for(int i = 0;i<ch.length;i++)
		{
			int j = i+1;
				while(j<ch.length && ch[i] == ch[j] && ch[j] == ' ')
				{
					ch[j] = '\u0000';
					j++;
				}
			
		}
		System.out.println(ch);
		
		
//		String result = s.replaceAll("\\s+"," ");
//		System.out.println(result);
		
		sc.close();
	}
}
