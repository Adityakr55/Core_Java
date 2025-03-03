package com.Recursion;

public class StronNo {
	public static void main(String[] args)
	{
		int n = 144;
		System.out.println(isStrong(n,n,0));
	}
	
	static boolean isStrong(int n, int m, int sum)
	{
		if(m==0) return sum == n;
		sum += fact(m%10);
		return isStrong(n,m/10,sum);
	}
	
	static int fact(int n)
	{
		if(n==0) return 1;
		return n*fact(n-1);
	}
}
