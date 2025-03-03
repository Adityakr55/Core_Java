package com.MultiThreading;

class T1 extends Thread{
	public void run() {
		try {
			Demo.t2.join();
		} catch (InterruptedException e) {
			
		}
		for(int i = 1;i<=5;i++)
		{
			System.out.println("T1:" + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class T2 extends Thread{
	public void run() {
		try {
			Demo.m.join();
		} catch (InterruptedException e) {
			
		}
		for(int i = 1;i<=5;i++)
		{
			System.out.println("T2:" + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class Demo {
	static Thread m;
	static T2 t2;

	public static void main(String[] args) throws InterruptedException {
		m = Thread.currentThread();
		
		t2 = new T2();
		T1 t1 = new T1();
		t1.start();
		t2.start();
		for(int i = 1;i<=5;i++)
		{
			System.out.println("Main:" + i);
			Thread.sleep(200);
		}
	}
	
}
