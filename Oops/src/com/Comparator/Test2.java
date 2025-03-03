package com.Comparator;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		Emp e1 = new Emp("Jack", 99999);
		Emp e2 = new Emp("Rose", 87363);
		Emp e3 = new Emp("Amit", 95873);
		Emp e4 = new Emp("Sumit", 45876);
		Emp e5 = new Emp("Rishav", 98765);
		
		Emp[] arr = {e3,e1,e5,e4,e2};
		
		Arrays.sort(arr);
		
		for(Emp e:arr) {
			System.out.println(e);
		}
	}

}
