package com.practise;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {4,7,5,9,3,2,8,3,1,55};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));


	}

	private static void sort(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>-1 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}

}
