package com.SortAlgo;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {4,5,9,1,3,4,23,12};
		System.out.println(Arrays.toString(arr));
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr,int start,int end) {
		
		if(start>=end) return;
		
		int pivot = arr[(start+end)/2];
		int i = start;
		int j = end;
		while(i<=j) {
			while(arr[i]<pivot)i++;
			while(arr[j]>pivot)j--;
			
			if(i<=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			sort(arr,start,j);
			sort(arr,i,end);
		}
	}

}
