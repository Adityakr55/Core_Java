package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroOrMoreOccurance {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ba*");
		Matcher m = p.matcher("abaaaabaahbg");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("============");
		}
	}
}
