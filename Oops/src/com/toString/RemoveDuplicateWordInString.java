package com.toString;

import java.util.Scanner;

public class RemoveDuplicateWordInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		String[] st = s.split(" ");
		for(int i = 0;i<st.length;i++)
		{
			if(st[i] == null)continue;
			for(int j = i+1;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
				{
					st[j] = null;
				}
			}
		}
		for(int i = 0;i<st.length;i++)
		{
			if(st[i] != null)
			{
				System.out.print(st[i]+" ");
			}
		}
		
		sc.close();
	}
}
