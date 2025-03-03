package com.Array;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] arr1 = {3,5,6,3,9,4,5,5};
		int []arr2 = {8,9,4,5,21};
		
		int[] arr3 = new int[arr1.length + arr2.length];
		
		for(int i = 0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		for(int i = 0;i<arr2.length;i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		
		System.out.println(Arrays.toString(arr3));
	}

}
