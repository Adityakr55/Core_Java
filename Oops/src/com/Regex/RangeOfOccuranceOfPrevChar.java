package com.Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RangeOfOccuranceOfPrevChar {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab{3,8}");
		Matcher m = p.matcher("abcdabbbpshabbbbbsfhabbbbbb");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("==========");
		}
	}
}
