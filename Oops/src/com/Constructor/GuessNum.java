package com.Constructor;
import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		
		int r_num = (int)(Math.random()*10 + 1);
		int score = 0;
		
		
		for(int i = 5;i>=1;i--)
		{
			System.out.println("Enter a number between (1-10):");
			int num = sc.nextInt();
			
			if(r_num == num) 
			{
				System.out.println("Your guess is correct:");
				score +=10;
				r_num = (int)(Math.random()*10 + 1);
			}
			else
			{
				System.out.println("Your guess is wrong. you have "+(i-1)+"chances left");
			}
		}
		
		System.out.println("Your score is "+score);
		
		sc.close();
	}
}
