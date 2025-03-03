package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExactNoFoOccuranceOfPreviousChar {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab{3}");
		Matcher m = p.matcher("ababbbbcdabbbbbbb");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("=============");
		}
	}

}
