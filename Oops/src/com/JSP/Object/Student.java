package com.JSP.Object;
import java.util.Scanner;

public class Student {
	String name;
	int age;
	long mobile_no;
	static String address;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of first student: ");
		Student obj1 = new Student();
		obj1.name = sc.next();
		obj1.age = sc.nextInt();
		obj1.mobile_no = sc.nextLong();
		Student.address = sc.next();
		
		System.out.println("Enter the details of second student: ");
		Student obj2 = new Student();
		obj2.name = sc.next();
		obj2.age = sc.nextInt();
		obj2.mobile_no = sc.nextLong();
		Student.address = sc.next();
	
		System.out.println(obj1.name +"\n"+obj1.age+"\n"+obj1.mobile_no+"\n"+Student.address );
		System.out.println("===========================");
		System.out.println(obj2.name +"\n"+obj2.age+"\n"+obj2.mobile_no+"\n"+Student.address );
		sc.close();
		
	}
	
}
