package com.practise;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
int[] arr = {3,4,2,5,5,3,9,34,56,84,69};
		
		int key = 69;
		Arrays.sort(arr);
		int index = binarySearch(arr,key,0,arr.length-1);
		if(index != -1) {
			System.out.println(key+" is present in the array.");
		}
		else {
			System.out.println(key+" is not present in the array.");
		}

	}
	
	public static int binarySearch(int[] arr,int key,int start,int end) {
		if(start>end) return -1;
		int mid = (start + end)/2;
		if(arr[mid] == key) {
			return mid;
		}
		if(arr[mid]>key) {
			end = mid -1;
		}
		else {
			start = mid+1;
		}
		
		return binarySearch(arr,key,start,end);
	}

}
