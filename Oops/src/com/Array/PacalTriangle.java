package com.Array;

public class PacalTriangle {

	public static void main(String[] args) {
		int n = 5;
		int[][] c = pascal(n);
		int spaces = n;
		for(int[] i: c) {
			for(int j = 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int m: i) {
				System.out.print(m+" ");
			}
			System.out.println();
			spaces--;
		}
	}

	private static int[][] pascal(int n) {
		int[][] c = new int[n][];
		
		for(int i = 0;i<n;i++) {
			c[i] = new int[i+1];
			
			for(int j = 0;j<i+1;j++) {
				if(j == 0||j == i) {
					c[i][j] = 1;
				}
				else {
					c[i][j] = c[i-1][j-1] + c[i-1][j];
				}
			}
		}
		return c;
	}

}
