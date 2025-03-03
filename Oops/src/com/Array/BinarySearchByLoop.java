package com.Array;

public class BinarySearchByLoop {

	public static void main(String[] args) {
		int[] arr = {2,5,6,7,1,54,69};
		int key = 7;
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(arr[mid] == key) {
				System.out.println("element is present");
				break;
			}
			else if(key<arr[mid]) {
				end = mid -1;
			}
			else {
				start = mid+1;
			}
		}
		if(start>end) {
			System.out.println("Element not found");
		}

	}

}
