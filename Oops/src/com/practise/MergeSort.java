package com.practise;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {4,7,5,9,3,2,8,3,1,55};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));


	}

	private static void sort(int[] arr) {
		if(arr.length==1)return;
		int[] left = new int[arr.length/2];
		int[] right = new int[arr.length - left.length];
		
		for(int i = 0;i<left.length;i++) {
			left[i] = arr[i];
		}
		for(int i = 0;i<right.length;i++) {
			right[i] = arr[left.length+i];
		}
		
		sort(left);
		sort(right);
		merge(left,right,arr);
		
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<left.length && j < right.length) {
			if(left[i]<right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			}
			else{
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i<left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}
		while(j<right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
		
	}

}
