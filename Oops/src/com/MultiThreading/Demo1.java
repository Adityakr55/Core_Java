package com.MultiThreading;

class MyThread extends Thread{
	@Override
	public void run(){
		for(int i = 1;i<=10;i++)
		{
			System.out.println("Child thread"+i);
			if(i == 5)
			{
				System.out.println(i/0);
			}
				try {
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread(); // new thread is created.
		t1.start(); // thread is started.
		// t1.start(); // Exception.
		
		for(int i = 1;i<=10;i++)
		{
			System.out.println("Main thread"+i);
			Thread.sleep(100);
		}
	}
}
