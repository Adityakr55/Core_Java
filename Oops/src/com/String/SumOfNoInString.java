package com.String;
import java.util.Scanner;

public class SumOfNoInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		int l = s.length(),sum = 0;
		System.out.println("Sum of no is: "+sumOfNo(l,sum,s,0));
		
		sc.close();
	}
	
	public static int sumOfNo(int l,int sum,String s,int i)
	{
		if(i>=l) return sum;
		char c = s.charAt(i);
		if(c >= '0' && c <= '9')
		{
			sum += c - '0';
		}
		
		return sumOfNo(l,sum,s,i+1);
	}
}
