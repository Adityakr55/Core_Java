package com.toString;
import java.util.Scanner;

public class a3c3d2TOaaacccdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		String res = "";
		
		for (int i = 0; i < ch.length; i++) {
            if (i < ch.length - 1 && (ch[i + 1] >= '0' && ch[i + 1] <= '9')) {
                int noOfChar = ch[i + 1] - '0';
                while (noOfChar > 0) {
                    res += ch[i];
                    noOfChar--;
                }
                i++; 
            } else {
                res += ch[i];
            }
        }
		System.out.println(res);
		sc.close();
	}
}
