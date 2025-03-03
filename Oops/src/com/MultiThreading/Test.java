package com.MultiThreading;

class Myth implements Runnable{
	@Override
	public void run() {
		for(char ch = 'A';ch<='K';ch++)
		{
			System.out.println(ch);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
public class Test {
	public static void main(String[] args) throws InterruptedException {
		Myth t1 = new Myth(); // An instance t1 of the Myth class is created, but it is just an object of the Runnable interface and not yet a thread.
		// t1.start(); // CTE  because t1 is not an instance of Thread.
		
		Thread t = new Thread(t1);
		t.start();
		
		Example t2 = new Example();
		t2.start();
		
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
		
	}
}

class Example extends Thread{
	@Override
	public void run(){
		for(int i = 1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
