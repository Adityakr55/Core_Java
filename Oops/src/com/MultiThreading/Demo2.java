package com.MultiThreading;

class MyThreads extends Thread{
	
}
public class Demo2 {
	public static void main(String[] args) {
		MyThreads t1 = new MyThreads();
		MyThreads t2 = new MyThreads();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		Thread m = Thread.currentThread();
		System.out.println(m.getName());
		System.out.println(m.getId());
		System.out.println(m.getPriority());
	}
}
