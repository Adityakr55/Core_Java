package com.toString;
import java.util.Scanner;
public class SumOfNumberInTheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		String res = "";
		int sum = 0;
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				res +=ch;
			}
			else
			{
				if(res != "")
				{
					sum += Integer.parseInt(res);
					res = "";
;				}
			}
			if(i == s.length()-1 && res != "")
			{
				sum += Integer.parseInt(res);
				res = "";
			}
		}
		System.out.println(sum);
		
		sc.close();
	}

}
