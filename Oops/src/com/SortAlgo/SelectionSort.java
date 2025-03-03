package com.SortAlgo;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {4,5,9,1,3,4,23,12};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			int index = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) { // if arr[j] > arr[index] then it will sort in descending order.
					index = j;
				}
			}
			if(index != i) // if arr[i] == arr[index], then no need to swap, if i will swap then also no problem.
			{
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
	}
}
