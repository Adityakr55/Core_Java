package com.listimpl;

public class Arraylist {
	private Object[] a;
	private int p;
	public Arraylist() {
		a = new Object[5];
		p = 0;
	}
	
	public void add(Object e) {
		if(p>=a.length) {
			increaseArraySize();
		}
		a[p++] = e;
	}
	
	private void increaseArraySize() {
		Object[] temp = new Object[a.length +1];
		for(int i = 0;i<a.length;i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	
	public void add(int index,Object e) {
		if(index<=-1 || index>=size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		if(p>=a.length) increaseArraySize();
		for(int i = size()-1;i>=index;i--) {
			a[i+1] = a[i];
		}
		a[index] = e;
		p++;
	}
	
	public int size() {
		return p;
	}
	
	public Object get(int index) {
		if(index <= -1 || index >=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	
	public void remove(int index) {
		if(index <= -1 || index >= size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for(int i = index + 1;i<size();i++) {
			a[i-1] = a[i];
		}
		p--;
		a[p]=null;
	}
}
