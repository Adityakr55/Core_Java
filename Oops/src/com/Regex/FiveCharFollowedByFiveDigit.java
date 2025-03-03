package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FiveCharFollowedByFiveDigit {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z]{5}[0-9]{5}");
		Matcher m = p.matcher("abahdfhaafha347373947afh34adawsf34346");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("============");
		}

	}

}
