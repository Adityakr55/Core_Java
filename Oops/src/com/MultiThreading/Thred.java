package com.MultiThreading;
@FunctionalInterface
interface Runable{
	void run();
	
}

public class Thred {
	Runable r;
	public Thred() {
		
	}
	Thred(Runable r){
		this.r = r;
	}
	
	void start()
	{
		if(r != null) {
			r.run();
		}
		else {
			run();
		}
	}
	
	public void run() {
		
	}
}
