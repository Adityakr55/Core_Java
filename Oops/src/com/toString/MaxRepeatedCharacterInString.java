package com.toString;

import java.util.Scanner;
// this program is correct for ASCII based character only not for Unicode character.
// if you want to include unicode also then for optimal solution you have to use hashmap.

// time complexity: O(256);

//public class MaxRepeatedCharacterInString {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string: ");
//		String s = sc.nextLine();
//		
//		int max = 0;
//		char character = '\u0000';
//		
//		char[] ch = s.toCharArray();
//		
//		int[] countArray = new int[256];
//      
//       for (char c : ch) {
//           if (c != '\u0000') {
//               countArray[c]++;
//           }
//       }
//       for (int i = 0; i < 256; i++) {
//          if(max<countArray[i])
//          {
//        	  max = countArray[i];
//        	  character = (char)i;  
//          }
//       }
//       System.out.println(character + " occurs maximum with " + max + " times.");
//	}
//}



// time complexity: O(n^2) approach.

public class MaxRepeatedCharacterInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		int max = 0;
		char character = '\u0000';
		
		char[] ch = s.toCharArray();
		
		for(int i = 0;i<ch.length;i++)
		{
			int count = 1;
			if(ch[i] == '\u0000')
			{
				continue;
			}
			for(int j = i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j] = '\u0000';
				}
			}
          if(max<count)
          {
        	  max = count;
        	  character = ch[i];  
          }
       }
       System.out.println(character + " occurs maximum with " + max + " times.");
       
       sc.close();
	}
}
