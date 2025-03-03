package com.toString;
import java.util.Scanner;
public class RemoveDuplicateCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		char[] ch =s.toCharArray();
		String res = "";
		for(int i = 0;i<ch.length;i++)
		{
			if(ch[i] == '\u0000')
			{
				continue;
			}
			
			for(int j = i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					ch[j] = '\u0000';
				}
			}
			res +=ch[i];
		}
		System.out.println(ch);
		
		sc.close();
	}
}
