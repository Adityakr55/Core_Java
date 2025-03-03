package com.ObjectClass;

public class Student {
	int age;
	int id;
	long mobile;
	
	public Student(int age,int id, long mobile)
	{
		this.age = age;
		this.id = id;
		this.mobile = mobile;
	}
	
	@Override
	public String toString()
	{
		return age +" "+id+" "+mobile;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Student s = (Student)o;
		return this.age == s.age && this.id == s.id && this.mobile == s.mobile;
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student(22,1,9343098443l);
		Student s2 = new Student(22,1,9343098443l);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2); // false b/c the refrence value of s1 and s2 in the heap area is different.
		System.out.println(s1.equals(s2));
	}
}
