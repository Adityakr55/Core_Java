package com.toString;
import java.util.Scanner;
public class ArrangeCharOfStringInAscen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		for(int i = 0;i<ch.length;i++)
		{
			for(int j = i+1;j<ch.length;j++)
			{
				if(ch[i] > ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);
		
		sc.close();
	}

}
