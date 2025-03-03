package com.ExceptionHandling;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount in your account:");
		int n = sc.nextInt();
		System.out.println("Enter the amount you want to withdraw:");
		int m = sc.nextInt();
		Account a = new Account(n);
		try {
			a.withdraw(m);
		}
		catch(InsufficientBalException e){
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println("Handled");
		}
	}
}
