package com.MultiThreading;

class Th_1 extends Thread{
	@Override
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println("Child Thread:" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Test_1 {
	public static void main(String[] args)  {
		Th_1 t1 = new Th_1();
		t1.setDaemon(true);
		t1.start();
		
		for(int i = 0;i<=10;i++) {
			System.out.println("Main Thread:"+i);
			if(i==5) {
				System.out.println(i/0);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			
		}
			
	}
}
