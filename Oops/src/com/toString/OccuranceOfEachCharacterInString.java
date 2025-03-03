package com.toString;

import java.util.Scanner;

// O(N^2) approach 

public class OccuranceOfEachCharacterInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		for(int i = 0;i<ch.length;i++)
		{
			int count = 1;
			if(ch[i] == '\u0000')continue;
			for(int j = i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j] = '\u0000';
				}
			}
			System.out.println(ch[i]+" occurs "+count+" times.");
		}
		
		sc.close();
	}
}


// O(n) approach using an array where each index represent ASCII value of character except unicode.


//public class OccuranceOfEachCharacterInString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String s = sc.nextLine();
//        
//        // Initialize a count array for ASCII characters (256 possible characters)
//        int[] countArray = new int[256];
//        
//        // Traverse the string and count characters
//        for (char c : s.toCharArray()) {
//            if (c != '\u0000') {  // Ignore spaces if not required to count
//                countArray[c]++;
//            }
//        }
//
//        // Print the occurrence of each character
//        for (int i = 0; i < 256; i++) {
//            if (countArray[i] > 0) {
//                System.out.println((char) i + " occurs " + countArray[i] + " times.");
//            }
//        }
//    }
//}

// to count occurrence of each Unicode characters


//public class OccuranceOfEachCharacterInString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String s = sc.nextLine();
//        
//        // Create an array for Unicode character counts (0 to 65535)
//        int[] countArray = new int[Character.MAX_VALUE + 1]; // Array size for all Unicode characters
//
//        // Traverse the string and count characters
//        for (char c : s.toCharArray()) {
//            countArray[c]++;  // Increment the count for the corresponding Unicode character
//        }
//
//        // Print the occurrence of each character (only characters that appear)
//        for (int i = 0; i <= Character.MAX_VALUE; i++) {
//            if (countArray[i] > 0) {
//                System.out.println((char) i + " occurs " + countArray[i] + " times.");
//            }
//        }
//    }
//}