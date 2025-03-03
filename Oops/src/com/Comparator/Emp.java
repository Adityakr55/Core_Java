package com.Comparator;

public class Emp implements Comparable<Object> {
	String name;
	int id;
	double sal;
	static int num = 100;
	
	Emp(String n, double s){
		name = n;
		id = num++;
		sal = s;
	}
	
	@Override
	public int compareTo(Object arg) {
		Emp e = (Emp)arg;
		
		if(sal>e.sal) return 1;
		if(sal<e.sal) return -1;
		return 0;
	}
	
	@Override
	public String toString() {
		return "Emp[ name = "+name+", id = "+id+", sal = "+sal+"]";
	}
}
