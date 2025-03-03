package com.toString;
import java.util.Scanner;

public class OccuranceOfEachWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new string: ");
		String s = sc.nextLine();
		
		String[] str = s.split(" ");
		
		for(int i = 0;i<str.length;i++)
		{
			int count = 1;
			if(str[i] == "") continue;
			
			for(int j = i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j] ="";
				}
			}
			System.out.println(str[i]+" occurs "+count+" times.");
		}
		sc.close();
	}
}
