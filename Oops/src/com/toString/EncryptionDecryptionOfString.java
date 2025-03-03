package com.toString;
import java.util.Scanner;

public class EncryptionDecryptionOfString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter a no: ");
		int n = sc.nextInt();
		
		System.out.println(encode(s,n));
		System.out.println(decode(encode(s,n),n));
		
//		System.out.println(encode("abc",2));
//		System.out.println(decode("abc",2));
		sc.close();
	}

	public static String encode(String s, int n)
	{
		String res = "";
		
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				res += (char)(((ch + n - 'A')%26 +26)%26 + 'A');
			}
			else if(Character.isLowerCase(ch))
			{
				res +=(char)(((ch + n - 'a')%26 + 26)%26 + 'a');
			}
		}
		return res;
		
	}
	
	private static String decode(String s, int n) {
		
		return encode(s,-n);
	}
}
