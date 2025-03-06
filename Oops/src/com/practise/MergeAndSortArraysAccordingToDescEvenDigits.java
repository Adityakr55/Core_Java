package com.practise;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeAndSortArraysAccordingToDescEvenDigits {
	// WAJP to merge two arrays and sort them according to descending even digits.
	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,2,7,8,8};
		int[] arr2 = {34,43,32,5,3,4,5};
		
		ArrayList<Integer> even = new ArrayList<>();
		
		for(int i = 0;i<arr1.length;i++) {
			if(arr1[i]%2 == 0) {
				even.add(arr1[i]);
			}
		}
		for(int i = 0;i<arr2.length;i++) {
			if(arr2[i]%2 == 0) {
				even.add(arr2[i]);
			}
		}
		
		int[] res = even.stream().mapToInt(Integer::intValue).toArray();
		// ----------------- or --------------------
//		int size = even.size();
//		int[] res = new int[size];
//		for(int i = 0;i<size;i++) {
//			res[i] = even.get(i);
//		}
		
		sort(res);
		System.out.println(Arrays.toString(res));
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
