package com.SortAlgo;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {4,5,9,1,3,4,23,12};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length - 1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
