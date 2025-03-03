package com.toString;
import java.util.Scanner;

public class NoOfWordsInStringWithoutSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		int count = 0;
		if(ch[0] != ' ')
			count++;
		for(int i = 1;i<ch.length;i++)
		{
			if(ch[i-1] ==' ' && ch[i] != ' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}
}
