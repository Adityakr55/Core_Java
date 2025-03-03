package com.toString;

import java.util.Scanner;

public class CountOfSecondMinCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		int min = s.length();
		int secondmin = s.length();
		char minchar = '\u0000';
		char sminchar = '\u0000';
		boolean flag = true;
		char[] ch = s.toCharArray();
		
		for(int i = 0;i<ch.length;i++)
		{
			int count = 1;
			if(ch[i] == '\u0000')
			{
				continue;
			}
			for(int j = i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j] = '\u0000';
				}
			}
          if(min>count)
          {
        	  secondmin = min;
        	  min = count;
        	  sminchar = minchar;
        	  minchar = ch[i];
          }
          else if(secondmin>count && count != min)
          {
        	  secondmin = count;
        	  sminchar = ch[i];
          }
          else if(secondmin == s.length() && i == ch.length-1)
          {
        	  System.out.println("No second min char exist");
        	  flag = false;
          }
         
       }
		if(flag)
		{
			System.out.println(sminchar + " occurs second minimum with " + secondmin + " times.");
		}
       sc.close();
	}
}
