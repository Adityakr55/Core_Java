package com.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DaysValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String exp = "0[1-9]|[12][0-9]|3[01]";
		
		Pattern p = Pattern.compile(exp);
		
		System.out.println("Enter a day (01-31");
		String day = sc.next();
		
		Matcher m = p.matcher(day);
		
		if(m.matches()) {
			System.out.println(day + " is a valid day.");
		}
		else {
			System.out.println(day + " is not a valid day.");
		}
		
		String exp1 = "0[1-9]|1[0-2]";
		Pattern p1 = Pattern.compile(exp1);
		
		System.out.println("Enter a month (01-12)");
		String month = sc.next();
		
		Matcher m1 = p1.matcher(month);
		
		if(m1.matches()) {
			System.out.println(month + " is a valid month.");
		}
		else {
			System.out.println(month + " is not a valid month.");
		}
	}
}
