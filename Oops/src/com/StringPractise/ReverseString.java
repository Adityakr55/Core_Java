package com.StringPractise;

class A{
	A(){
		System.out.println("A");
	}
	A(int i){
		System.out.println("B");
	}
	
	A(int i,int j){
		System.out.println("C");
	}
}

public class ReverseString {

	public static void main(String[] args) {
		A a = new A(2,3);

	}

}
