package com.listimpl;

public class Test1 {

	public static void main(String[] args) {
		Arraylist l = new Arraylist();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		l.add(0,60);
		l.add(4,70);
		l.remove(0);
		
		for(int i = 0;i<l.size();i++) {
			System.out.println((Integer)l.get(i));
		}

	}

}
