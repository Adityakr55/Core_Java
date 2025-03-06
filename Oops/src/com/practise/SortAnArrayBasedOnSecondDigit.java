package com.practise;

import java.util.Arrays;

public class SortAnArrayBasedOnSecondDigit {
	// WAJP to sort the given array according to it's second digit descending order.
	public static void main(String[] args) {
		int[] arr = {123,344,41,4343};
		
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
private static void sort(int[] arr,int start,int end) {
		
		if(start>=end) return;
		
		int pivot = arr[(start+end)/2]%10;
		int i = start;
		int j = end;
		while(i<=j) {
			while(arr[i]%10<pivot)i++;
			while(arr[j]%10>pivot)j--;
			
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
