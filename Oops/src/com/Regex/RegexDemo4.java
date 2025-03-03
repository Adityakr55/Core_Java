package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a[bc]");
		Matcher m = p.matcher("abcdacefa1");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("-----------");
		}
	}
}