package com.toString;
import java.util.Scanner;

// input:- aAdgjGkRkkLel
// output:- AaDGJgKrKKlEL

public class UpperToLowerCaseAndViceVersa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		
		char[] ch = s.toCharArray();
		
		for(int i = 0;i<ch.length;i++)
		{
			if(ch[i] >= 'A' && ch[i]<='Z')
			{
				ch[i] = Character.toLowerCase(ch[i]);
			}
			else
			{
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
		
		sc.close();
	}
}
