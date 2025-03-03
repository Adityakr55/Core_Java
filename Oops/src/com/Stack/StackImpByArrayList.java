package com.Stack;

import java.util.EmptyStackException;

public class StackImpByArrayList {
	Object[] arr = new Object[10];
	private int index = 0;
	
	public void push(Object ele) {
		if(index>=arr.length) {
			increase();
		}
		arr[index++] = ele;
	}

	private void increase() {
		Object[] temp = new Object[arr.length + 3];
		for(int i = 0;i<arr.length;i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	public int size() {
		return index;
	}
	
	public Object peek() {
		if(index<= 0) {
			throw new EmptyStackException();
		}
		return arr[index-1];
	}
	
	public Object pop() {
		if(index<=0) {
			throw new EmptyStackException();
		}
		Object temp = arr[index-1];
		arr[index -1] = null;
		index--;
		return temp;
	}
	
	public boolean isEmpty() {
		return index == 0;
	}
}
