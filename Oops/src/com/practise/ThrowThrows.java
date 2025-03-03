package com.practise;

public class ThrowThrows {
	public static void main(String[] args) throws Exception{
		m1(5);
		System.out.println("Kumar");
	}

	private static void m1(int i) throws Exception {
		
			if(i>2)
				throw new Exception("kaam ho gya");
		
		System.out.println("Aditya");
		
	}
}
