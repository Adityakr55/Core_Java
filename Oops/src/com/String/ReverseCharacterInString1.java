package com.String;
import java.util.Scanner;

public class ReverseCharacterInString1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		String s2 = "";
		int l = s.length()-1;
		while(l>=0)
		{
			s2 +=s.charAt(l);
			l--;
		}
		System.out.println(s2);
		
		sc.close();
	}
}
