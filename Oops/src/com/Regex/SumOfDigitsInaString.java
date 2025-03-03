package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfDigitsInaString {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]");
		//Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher("ab123cd45ef6");
		
		int sum = 0;
		while(m.find())
		{
			sum += Integer.parseInt(m.group());
		}
		System.out.println(sum);
	}
}
