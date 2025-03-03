package com.Array;

import java.util.Arrays;

public class ArraycopyMethod {
	// static int[] arr2 = new int[4];
	public static void main(String[] args) {
		int[] arr1 = {4,3,5,2,6,7,8,9};
		int[] arr2 = new int[4];
		
		System.arraycopy(arr1, 3, arr2, 0, 3);
		System.out.println(Arrays.toString(arr2));
		
		// Copying element in same array.
		System.arraycopy(arr1, 0, arr1, 4, 4);
		System.out.println(Arrays.toString(arr1));
	}
}
