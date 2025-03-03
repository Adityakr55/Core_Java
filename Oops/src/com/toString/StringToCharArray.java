package com.toString;

import java.util.Scanner;

public class StringToCharArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		
		char[] ch = s.toCharArray();
			System.out.println(ch);
			
			int l = ch.length;
//			for(int i = 0;i<l;i++)
//			{
//				System.out.print(ch[i]+" ");
//			}
			
			tocharArray(ch,l,0);
			
			sc.close();
	}
	
	protected static void tocharArray(char[] ch,int l,int i)
	{
		if(i==l) return;
		System.out.print(ch[i]+" ");
		tocharArray(ch,l,i+1);
	}
}
