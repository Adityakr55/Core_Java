package com.practise;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16},{17,18,19,20}};
		int[][] result = new int[arr[0].length][arr.length];
		for(int i = 0;i<arr[i].length;i++) {
			for(int j = 0;j<arr.length;j++) {
				result[i][j] = arr[j][i];
			}
		}
		for(int i = 0;i<result.length;i++) {
			for(int j = 0;j<result[i].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
