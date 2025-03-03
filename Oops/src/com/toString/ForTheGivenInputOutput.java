package com.toString;
import java.util.Scanner;

// input:- Hello world
// output:- He121 w2r3d

public class ForTheGivenInputOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		for(int i = 0;i<ch.length;i++)
		{
			int count = 1;
			for(int j = i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j] && (ch[i]<='0' || ch[i] >= '9'))
				{
					count++;
					String res = ""+count;
					ch[j]=res.charAt(0);
				}
			}
			if(count>1)
			{
				ch[i]='1';
			}
			
		}
		System.out.println(ch);
		
		sc.close();
	}
}
