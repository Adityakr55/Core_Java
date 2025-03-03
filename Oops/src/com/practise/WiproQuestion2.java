package com.practise;

import java.util.Scanner;

public class WiproQuestion2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextLong();
	        long M = sc.nextLong();
	        long maxTeams = Math.min((N + M) / 4, Math.min(N, M));
	        System.out.println(maxTeams);
	    }
}
