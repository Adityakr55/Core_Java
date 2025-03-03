package com.Recursion;

import java.util.Scanner;

public class PrimeNoInRange {
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
		if(isPrime(a,a/2))
		{
			System.out.println(a+" ");
		}
		range(a+1,b);
	}
	public static boolean isPrime(int n,int i)
	{
		if(n<=1) return false;
		if(i == 1) return true;
		if(n%i == 0) return false;
		return isPrime(n,i-1);
	}
}
