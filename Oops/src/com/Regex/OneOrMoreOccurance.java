package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OneOrMoreOccurance {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a+");
		Matcher m = p.matcher("abaaabcdaaaaasdaaaaaaa");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("=========");
		}
	}
}
