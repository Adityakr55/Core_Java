package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AtleastOneOccurOfSmallCaseCharAnywhere {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(?=.*[a-z])");
		Matcher m = p.matcher("3847a34093$#34ahfkh");
		
		System.out.println( m.find());
	}

}
