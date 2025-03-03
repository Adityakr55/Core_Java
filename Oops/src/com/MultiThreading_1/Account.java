package com.MultiThreading_1;

public class Account {
	int bal;
	
	public Account(int bal) {
		this.bal = bal;
	}
	
	public synchronized void withdraw(int amount) {
		if(amount>bal) {
			System.out.println("Less Balance");
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		
		bal -=amount;
		System.out.println(amount + " Withdrawn done");
		System.out.println(bal + " is available balance");
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("Going to deposit.");
		bal += amount;
		notify();
		System.out.println("Deposit done");
	}
}
