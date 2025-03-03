package com.toString;

import java.util.Scanner;

public class SecondSmallestSubstringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();

		int minlen = Integer.MAX_VALUE, secondMinlen = minlen;
		String smallestPalindrom = "", secondSmallestPalindrom = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 2; j <= s.length(); j++) {
				String substr = s.substring(i, j);
				if (isPalindrome(substr)) {
					int len = substr.length();

					if (len < minlen) {
						secondMinlen = minlen;
						minlen = len;
						secondSmallestPalindrom = smallestPalindrom;
						smallestPalindrom = substr;
					}

					else if (len > minlen && len < secondMinlen) {
						secondMinlen = len;
						secondSmallestPalindrom = substr;
					}
				}
			}
		}

		System.out.println(secondSmallestPalindrom);
	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
