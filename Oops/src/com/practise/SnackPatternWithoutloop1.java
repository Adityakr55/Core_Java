package com.practise;

import java.util.Scanner;

public class SnackPatternWithoutloop1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		helper(n,1);
	}
	private static void helper(int n, int i) {
		if(i>n) return;
		if(i%2 != 0) printforward(n*i - (n - 1),n,1);
		else printbackward(n*i,n,1);
		System.out.println();
		helper(n,i+1);	
	}
	private static void printforward(int k, int n, int i) {
		if(i > n) return;
		System.out.print(k+"\t");
		printforward(k+1,n,i+1);
	}
	private static void printbackward(int k, int n, int i) {
		if(i > n) return;
		System.out.print(k+"\t");
		printbackward(k - 1,n,i+1);	
	}
}
