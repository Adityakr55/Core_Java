package com.Comparator;

public class Circle implements Comparable<Object> {
	int radius;
	
	public Circle(int r) {
		radius = r;
	}
	
	@Override
	public String toString() {
		return "Circle[ radius = "+ radius+"]";
	}
	
	@Override
	public int compareTo(Object arg) {
		return radius - ((Circle)arg).radius;
		
	}
}
