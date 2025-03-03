package com.practise;

public class BookMyShow {

	public static void main(String[] args) {
		Theater t1 = Theater.getIns();
		t1.bookTicket(40);
		Theater t2 = Theater.getIns();
		t2.bookTicket(9);
		Theater t3 = Theater.getIns();
		t3.bookTicket(2);

	}

}
