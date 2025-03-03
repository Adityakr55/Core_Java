package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackRefFunction {
	public static void main(String[] args) {
		//Pattern p = Pattern.compile("([a-z])([a-z])\\1");
		//Pattern p = Pattern.compile("([a-z])([a-z])\\2");
		//Pattern p = Pattern.compile("([a-z])\\1+");
		Pattern p = Pattern.compile("([a-z])\\1*");
		Matcher m = p.matcher("abbaabbbbab");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("----------");
		}
	}
}
