package com.practise;
import java.util.Scanner;


public class HollowPyramid {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<2*n;j++)
			{
				if(i+j == n+1|| j-i == n-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = 1;i<=n;i++)
		{
			 for(int j = 1;j<2*n;j++)
			 {
				 if(j== i||i+j == 2*n)
				 {
					 System.out.print(" ");
				 }
				 else
				 {
					 System.out.print("*");
				 }
			 }
			 System.out.println();
		}
		
		int st = 2*n -1;
		int sp = 0;
		
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j = 1;j<=st;j++)
			{
				if( j==1||j==st)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
			st -= 2;
		}
		
		sc.close();
	}
}
