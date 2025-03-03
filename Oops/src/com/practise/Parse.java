package com.practise;

public class Parse {
	public static void main(String[] args) {
		String s1 = "true";
		String s2 = "24";
		String s3 = "9.8";
		
		boolean b = Boolean.parseBoolean(s1);
		System.out.println(b);
		Integer i = Integer.parseInt(s2);
		System.out.println(i);
		Double f = Double.parseDouble(s3);
		System.out.println(f);
	}
}
