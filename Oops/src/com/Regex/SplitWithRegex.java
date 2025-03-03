package com.Regex;

public class SplitWithRegex {
	public static void main(String[] args) {
		String s = "a1b2c3d";
		
		String[] a = s.split("[0-9]");
		
		for(String e:a) {
			System.out.println(e);
		}
	}
}
