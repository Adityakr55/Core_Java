package com.MultiThreading_1;

class A{
	public static synchronized void m1(String s) {
		for(int i = 0;i<=10;i++) {
			System.out.println("Executed by: "+s);
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				
			}
			
		}
	}
}

class MyThread extends Thread{
	A a;
	String s;
	
	public MyThread(A a,String s) {
		this.a = a;
		this.s = s;
	}
	
	@Override
	public void run() {
		a.m1(s);
	}
}

public class Test {
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		
		MyThread t1 = new MyThread(a1,"T1");
		MyThread t2 = new MyThread(a2,"T2");
		
		t1.start();
		t2.start();
	}
}
