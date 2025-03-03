package com.practise;
import java.util.Scanner;

class Sol{
	public static void print(int n)
	{
		int k = (n*(n + 1))/2;
		int num = 1;
		int m = n-1;
		for(int i = n;i>=1;i--)
		{
			int rightnum = k + (m*(m+1))/2+1;
			for(int j = 1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			
			for(int j = 1;j<=i;j++)
			{
				System.out.print(rightnum+" ");
				rightnum++;
			}
			m--;
			System.out.println();
		}
	}
}

public class Runner3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		Sol.print(n);
		
		sc.close();
	}
}
