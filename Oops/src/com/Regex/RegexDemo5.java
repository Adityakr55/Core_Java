package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a[^0-9]");
		Matcher m = p.matcher("abcdabefa1");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("-----------");
		}
	}
}