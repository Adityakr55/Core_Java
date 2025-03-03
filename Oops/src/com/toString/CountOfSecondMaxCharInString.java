package com.toString;

import java.util.Scanner;

public class CountOfSecondMaxCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		int max = 0;
		int secondmax = 0;
		char maxchar = '\u0000';
		char smaxchar = '\u0000';
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
          if(max<count)
          {
        	  secondmax = max;
        	  max = count;
        	  smaxchar = maxchar;
        	  maxchar = ch[i];
          }
          else if(secondmax<count && count != max)
          {
        	  secondmax = count;
        	  smaxchar = ch[i];
          }
          else if(secondmax == '\u0000' && i == ch.length-1)
          {
        	  System.out.println("No second max char exist");
        	  flag = false;
          }
         
       }
		if(flag)
		{
			System.out.println(smaxchar + " occurs second maximum with " + secondmax + " times.");
		}
		
		sc.close();
       
	}
}
