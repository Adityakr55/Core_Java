package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroOrOneOccurance {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab?");
		Matcher m = p.matcher("aabbbaabbabaa");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("=========");
		}
	}
}
