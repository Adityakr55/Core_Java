package com.Hashset;

public class HashsetDriver {
	public static void main(String[] args) {
		HashsetImp h = new HashsetImp();
//		System.out.println(h.add(10));
//		System.out.println(h.add(10));
//		System.out.println(h.add(20));
//		System.out.println(h.add(20));
//		System.out.println(h.add(30));
//		System.out.println(h.add(40));
		System.out.println(h.add(50));
		System.out.println(h.add(10));
		System.out.println(h.add("Apple"));
		//System.out.println(h.add("Apple"));
		System.out.println(h.add("Banana"));
		//System.out.println(h.add("Apple"));
		System.out.println(50);
		System.out.println(h.add(10));
		System.out.println("=================");
		h.display();
	}
}
