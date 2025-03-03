package com.toString;
import java.util.Scanner;

public class PanagramStringOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = sc.nextLine();
		System.out.println(isPanagram(s1));
		
		sc.close();
	}
	
	public static boolean isPanagram(String s1)
	{
		if(s1.length()<26) return false;
		s1 = s1.toLowerCase();
		s1 = s1.trim();
		s1 = s1.replaceAll("\\s+", "");
		String s2 = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0;i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			if(!s1.contains(ch+""))
			{
				return false;
			}
		}
		return true;
	}
}
