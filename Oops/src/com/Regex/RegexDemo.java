package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abcdabefa");
		
		int count = 0;
		while(m.find()) {
			count++;
		}
		System.out.println(count);
	}
}
