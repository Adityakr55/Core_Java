package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumValidation {
	public static void main(String[] args) {
		String phn = "9873475439";
		//String phn = "39439437473497";
		
		String exp = "[6-9][0-9]{9}"; // first digit is int the range of 6-9 and rest 9 is any digits.
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(phn);
		
		System.out.println(m.matches());
	}
}
