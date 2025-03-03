package com.String;
import java.util.Scanner;

public class ReverseWordsInString1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		// input:- Java is easy
		// output:- easy is Java
		
		int l = s.length();
		int i = l - 1;
		int j = l - 1;
		
		String s2 = "";
		
		while(j>=0)
		{
			while(j>=0 && s.charAt(j) != ' ')
			{
				j--;
			}
			int k = j+1;
			while(k<=i)
			{
				s2 += s.charAt(k);
				k++;
			}
			
			if(i>0)
			{
				s2 += " ";
			}
			j--;
			i = j;
		}
		System.out.println(s2);
		
		sc.close();
	}
}
