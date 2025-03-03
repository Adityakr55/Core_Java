package com.Recursion;
import java.util.Scanner;


public class ArmstrongNoInRange {
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
		int c = (int)Math.log10(a)+1;
		if(armstrong(a,a,c,0))
		{
			System.out.println(a);
		}
		range(a+1,b);
	}
	
	public static boolean armstrong(int n,int m,int count,int sum)
	{
		if(m==0) return n==sum;
		sum += (int)Math.pow(m%10, count);
		return armstrong(n,m/10,count,sum);
	}
}
