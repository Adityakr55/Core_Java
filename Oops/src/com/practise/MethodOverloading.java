package com.practise;

public class MethodOverloading {
	  public static void main(String[] args) {
	     
	        display(10);  // int promoted to float
	    }
	  
	  static void display(float a) {
	        System.out.println("float: " + a);
	    }

	   static  void display(double a) {
	        System.out.println("double: " + a);
	    }
	
	void m1(int a) {
		
	}
	
	int m1(char a) {
		return a;
	}
}
  

