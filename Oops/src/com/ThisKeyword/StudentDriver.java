package com.ThisKeyword;

class Student{
	
	String name;
	int age;
	long mobile;
	int sId;
	
	public void addStudent(String name,int age,long mobile, int sId) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.sId = sId;
	}
	
	public void display() {
		System.out.println(name +"\n"+age +"\n" + mobile+"\n"+sId);
	}
	
}
public class StudentDriver {
	public static void main(String[] args) {
		Student s = new Student();
		s.addStudent("Aditya",22,4798473948l,5);
		s.display();
	}
	
}
