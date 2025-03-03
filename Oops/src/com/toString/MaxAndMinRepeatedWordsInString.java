package com.toString;
import java.util.Scanner;

public class MaxAndMinRepeatedWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new string: ");
		String s = sc.nextLine();
		
		String[] str = s.split(" ");
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		String minWord = null;
		String maxWord = null;
		
		for(int i = 0;i<str.length;i++)
		{
			int count = 1;
			if(str[i] == "")continue;
			for(int j = i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j] = "";
				}
			}
			if(count<min)
			{
				min = count;
				minWord = str[i];
			}
			else if(count>max)
			{
				max = count;
				maxWord = str[i];
			}
		}
		
		System.out.println("Mininum repeated word is: "+minWord +" with: "+min+" times.");
		System.out.println("Maximum repeated word is: "+maxWord +" with: "+max+" times.");
		
		sc.close();
	}

}
