package com.Array;

import java.util.LinkedHashSet;

public class MergeTwoArrayAndRemoveDuplicates {
	public static void main(String[] args) {
		int[] arr1 = {3,5,6,3,9,4,5,5};
		int []arr2 = {8,9,4,5,21};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int num :arr1) {
			set.add(num);
		}
		
		for(int num : arr2) {
			set.add(num);
		}
		
		 System.out.println(set);
	}
}
