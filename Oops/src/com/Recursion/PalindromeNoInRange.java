package com.Recursion;

import java.util.Scanner;

public class PalindromeNoInRange {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		range(a,b);
		sc.close();
	}
	
	public static void range(int a,int b)
	{
		if(a>b) return;
		if(isPalindrome(a,a,0))
		{
			System.out.print(a+" ");
		}
		range(a+1,b);
	}
	
	public static boolean isPalindrome(int n,int m,int num)
	{
		if(m == 0) return n==num;
		num = num*10 + m%10;
		return isPalindrome(n,m/10,num);
	}
}
