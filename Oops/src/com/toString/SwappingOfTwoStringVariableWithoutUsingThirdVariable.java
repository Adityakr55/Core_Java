package com.toString;
import java.util.Scanner;

public class SwappingOfTwoStringVariableWithoutUsingThirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string to swap: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println("String before swap: ");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		s1 = s1 + s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("String after swap: ");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		sc.close();
	}
}
