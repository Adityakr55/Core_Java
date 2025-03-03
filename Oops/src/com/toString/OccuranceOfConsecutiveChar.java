package com.toString;
import java.util.Scanner;

public class OccuranceOfConsecutiveChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		String res = "";
		int count = 1;
		for(int i = 0;i<ch.length;i++)
		{
			if(i<ch.length-1 && s.charAt(i) == s.charAt(i+1))
			{
				count++;
			}
			else
			{
				res +=ch[i];
				if(count>1)
				{
					res +=count;
				}
				count = 1;
			}
		}
		System.out.println(res);
		
		sc.close();
	}
}
