package com.toString;
import java.util.Scanner;

public class IntegerToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		convert(num/10000000,"Crore");
		convert((num/100000)%100,"lakhs");
		convert((num/1000)%100,"thousands");
		convert((num/100)%10,"hundreds");
		convert(num%100,"");
		
		sc.close();
		
	}
	
	public static void convert(int n,String s)
	{
		String[] one = {"","one","two","three","four","five","six","seven","eight",
				"nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
				"seventeen","eighteen","nineteen"};
		
		String[] two = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty",
				"ninty"};
		
		if(n<20)
		{
			System.out.print(one[n]+" ");
		}
		else
		{
			System.out.print(two[n/10]+" "+one[n%10]+" ");
		}
		
		if(n != 0)
		{
			System.out.print(s+" ");
		}
	}
}
