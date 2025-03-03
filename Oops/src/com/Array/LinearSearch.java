package com.Array;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {3,4,2,5,5,3,9,34,56,84,69};
		
		int key = 69;
		int index = linearSearch(arr,key);
		if(index != -1) {
			System.out.println(key+" is present in the array at index "+index);
		}
		else {
			System.out.println(key+" is not present in the array.");
		}
	}
	
	public static int linearSearch(int[] arr,int key) {
		
		for(int i = 0;i<arr.length;i++) {
			if(key == arr[i]) {
				return i;
			}
		}
		
		return -1;
	}
}
