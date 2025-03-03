package com.MultiThreading_1;

public class Bank {
	public static void main(String[] args) {
		Account a = new Account(5000);
		
		new Thread() {   // This is an anonymous class that extends the Thread class.
			@Override
			public void run() {
				a.withdraw(6000);
			}
		}.start();   // Calls start() method of Thread class.
		
		new Thread() {
			@Override
			public void run() {
				a.deposit(2000);
			}
		}.start();
	}
}
