package com.Hashset;
class Node{
	Node next;
	Object ele;
	
	public Node(Object key,Node next) {
		this.ele = key;
		this.next = next;
	}
}
public class HashsetImp {
	Node[] arr= new Node[10];
	private int count = 0;
	
	public boolean add(Object key) {
		int index = Math.abs(key.hashCode()%arr.length);
		if(arr[index] == null) {
			arr[index] = new Node(key,null);
			count++;
			return true;
		}
		
		Node curr = arr[index];
		if((Integer)curr.ele == key) return false;
		while(curr.next != null) {
			
			curr = curr.next;
			if((Integer)curr.ele == key)return false;
			
		}
		
		curr.next = new Node(key,null);
		count++;
		return true;
	}
	
	public void display() {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] != null) {
				Node curr = arr[i];
				while(curr != null) {
					System.out.println(curr.ele);
					curr = curr.next;
				}
			}
			
		}
	}
}
