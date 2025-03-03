package com.SortAlgo;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {8,9,23,4,66,23,7,2,1};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		if(arr.length == 1) return;
		
		int[] left = new int[arr.length/2];
		int[] right = new int[arr.length - left.length];
		
		for(int i = 0;i<left.length;i++) {
			left[i] = arr[i];
		}
		for(int i = 0;i<right.length;i++) {
			right[i] = arr[left.length + i];
		}
		sort(left);
		sort(right);
		merge(left,right,arr);
	}
	
	public static void merge(int[] left, int[] right,int[] result) {
		int i = 0,j = 0, k = 0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				result[k++] = left[i++];
			}
			else {
				result[k++] = right[j++];
			}
		}
		
		while(i<left.length) {
			result[k++] = left[i++];
		}
		while(j<right.length) {
			result[k++] = right[j++];
		}
	}
	
	
}
