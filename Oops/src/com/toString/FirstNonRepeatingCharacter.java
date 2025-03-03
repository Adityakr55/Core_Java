package com.toString;
import java.util.Scanner;
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		int min = Integer.MAX_VALUE;
		char character = '\u0000';
		
		char[] ch = s.toCharArray();
		
		for(int i = 0;i<ch.length;i++)
		{
			int count = 1;
			if(ch[i] == ' ')continue;
			for(int j = i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j] = ' ';
				}
			}
			if(count == 1)
			{
				System.out.println(ch[i]+" occurs only once in the string.");
			}	
		}
		
		sc.close();
	}
}
