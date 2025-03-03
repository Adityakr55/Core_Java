package com.Regex;

public class ReplaceAndReplaceAll {
	public static void main(String[] args) {
		String s = "a1b2c3d";
		
		System.out.println(s.replace("[0-9]", ""));
		System.out.println(s.replaceAll("[0-9]", ""));
	}
}
