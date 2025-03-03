package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		String s = "as@df4jB";
		String exp = "(?=.*[!@#$%^&*|])(?=.*[A-Z])(?=.*[0-9]).{5,10}";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		System.out.println(m.matches());

	}

}
