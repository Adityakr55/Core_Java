package com.MultiThreading;

class NewThread extends Thread{
	
}
public class Demo3 {
	public static void main(String[] args) {
		NewThread t1 = new NewThread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.setName("ChildThread");
		t1.setPriority(9);
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
	}
}
