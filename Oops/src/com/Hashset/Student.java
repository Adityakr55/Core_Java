package com.Hashset;

import java.util.Objects;

public class Student {
	String name;
	int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "name "+ name +","+" Age: "+age;
	}
	
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	public boolean equals(Object o) {
		Student s1= (Student)o;
		return s1.name.equals(this.name) && this.age == s1.age;
	}
}
