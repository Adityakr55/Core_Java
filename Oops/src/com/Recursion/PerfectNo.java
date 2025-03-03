package com.Recursion;


public class PerfectNo {
	public static void main(String[] args)
	{
		int n = 28;
		System.out.println(isPerfect(n,n/2,0));
		
	}
	
	static boolean isPerfect(int n,int i,int sum)
	{
		if(i==0) return sum == n;
		if(n%i == 0) sum +=i;
		return isPerfect(n,i-1,sum);
	}
}
