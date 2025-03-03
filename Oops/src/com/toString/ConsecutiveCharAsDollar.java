package com.toString;
import java.util.Scanner;

public class ConsecutiveCharAsDollar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		for(int i = 1;i<ch.length;i++)
		{
				if(ch[i] == ch[i-1])
				{
					ch[i] = '$';
				}
		}
		System.out.println(ch);
		
		sc.close();
	}
}
