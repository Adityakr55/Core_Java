package com.practise;

import java.util.Scanner;

public class SnackPatternUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		helper(arr,0);
		
		
	}
	
	public static void helper(int[][] arr, int idx) {
		if(idx == arr.length) return;
		if(idx%2 == 0) {
			print(arr[idx]);
		}
		else {
			print(reverse(arr[idx],0,arr.length-1));
		}
		helper(arr,idx+1);
	}

	private static int[] reverse(int[] is, int i, int j) {
			if(i>=j)return is;
			int n = is[i];
			is[i] = is[j];
			is[j] = n;
			return reverse(is,i+1,j-1);
	}

	private static void print(int[] is) {
		for(int i =0;i<is.length;i++)
		{
			System.out.print(is[i]+" ");
		}
		System.out.println();
		
	}
}
