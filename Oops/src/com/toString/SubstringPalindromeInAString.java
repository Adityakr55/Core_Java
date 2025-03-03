package com.toString;

import java.util.Scanner;

public class SubstringPalindromeInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 2; j <= s.length(); j++) {
				String str = s.substring(i, j);
				if (isPalindrome(str)) {
					if (str.length() < s.length())
						System.out.println(str);
				}
			}
		}

		sc.close();
	}

	public static boolean isPalindrome(String s) {
		int l = 0;
		int r = s.length() - 1;
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
