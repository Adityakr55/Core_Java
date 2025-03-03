package com.MultiThreading_1;

class AA{
	public synchronized void m1(B b) {
		System.out.println("M1()-AA");
		System.out.println("AA class is calling B class Tag()-2");
		b.tag2();
	}
	
	synchronized public void tag1() {
		System.out.println("Tag()-1-AA");
	}
}

class B{
	synchronized public void m2(AA a) {
		System.out.println("M2()-B");
		System.out.println("B class is calling AA class Tag()-1");
		a.tag1();
	}
	
	public synchronized void tag2() {
		System.out.println("Tag()-2-B");
	}
}

class Th1 extends Thread{
	AA a = new AA();
	B b = new B();
	
	@Override
	public void run() {
		a.m1(b);
	}
	
	public void help() {
		b.m2(a);
	}
}

public class DeadLock {
	public static void main(String[] args) {
		Th1 t1 = new Th1();
		
//		t1.help();
//		t1.start(); Deadlock does not occur because t1.help() (executed in the main thread)
//					completes execution and releases locks on both objects (b and a) before
//			         t1.start() begins execution in a separate thread.
		
		t1.start();
		t1.help();
	}
}
