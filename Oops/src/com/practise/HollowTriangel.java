package com.practise;

import java.util.Scanner;

public class HollowTriangel {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		char ch ='A';
		int st = 2*n - 1;
		int sp = 0;
		
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int j = 1;j<=st;j++)
			{
				if(i == 1||j == 1 || j==st)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			sp++;
			st -=2;
		}
		
		sc.close();
	}
}
