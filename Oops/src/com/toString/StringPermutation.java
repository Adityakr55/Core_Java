package com.toString;
import java.util.Scanner;

public class StringPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		isPermutation(s,0,s.length()-1);
		sc.close();
	}

	private static void isPermutation(String s, int st, int end) {
		if(st == end)
		{
			System.out.println(s);
			return;
		}
		
		for(int i = st;i<=end;i++)
		{
			String s1 = swap(s,st,i);
			isPermutation(s1,st+1,end);
		}
		
	}

	private static String swap(String s, int i, int j) {
		char[] ch = s.toCharArray();
		char temp = ' ';
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);
	}
	
}
