package com.practise;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {4,7,5,9,3,2,8,3,1,55};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			int index = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) {
					index = j;
				}
			}
			
			if(index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		
	}

}
