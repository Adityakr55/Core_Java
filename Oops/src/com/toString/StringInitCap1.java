package com.toString;
import java.util.Scanner;

public class StringInitCap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		char[] ch =s.toCharArray();
		
		for(int i = 0;i<ch.length;i++)
		{
			if(i == 0 || ch[i-1] == ' ')
			{
//				ch[i] = Character.toUpperCase(ch[i]);
				if(ch[i] >= 'a' && ch[i] <= 'z')
				{
//					ch[i] = (char)(ch[i] - 32);
					
					ch[i] -=32;
				}
			}
			else
			{
				ch[i] = Character.toLowerCase(ch[i]);
//				if(ch[i] >='A' && ch[i] <= 'Z')
//				{
//					ch[i] +=32;
//				}
			}
		}
		System.out.println(ch);
		
		sc.close();
	}
}
