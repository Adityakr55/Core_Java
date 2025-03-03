package com.toString;
import java.util.Scanner;
import java.util.Set;

public class VowelToUnderscore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		int count = 0;
		for(int i = 0;i<ch.length;i++)
		{
//			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
//					ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
			
			if(isVowel(ch[i]))
			{
				count++;
			}

		}
		if(count>3)
		{
			for(int i = 0;i<ch.length;i++)
			{
				if(isVowel(ch[i]))
				{
						ch[i] = '_';
				}

			}
		}
		System.out.println(ch);
		
		sc.close();
	}
	
	private static boolean isVowel(char c)
	{
		Set<Character> vowel = Set.of('a','e','i','o','u','A','E','I','O','U');
		return vowel.contains(c);
	}
}
