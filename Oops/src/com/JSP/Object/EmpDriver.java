package com.JSP.Object;

class Emp{
	String name;
	int age;
	long mobile;
	int empId;
	
	public void display()
	{
		Emp e = new Emp();
		System.out.println(name +"\n"+ age+"\n"+mobile+"\n"+empId);
		System.out.println(e.name +"\n"+ e.age+"\n"+e.mobile+"\n"+e.empId);
	}
}

public class EmpDriver {

	public static void main(String[] args) {
		
		Emp e1 = new Emp();
		e1.name = "Nitish";
		e1.age = 22;
		e1.mobile = 3476379308l;
		e1.empId = 343;
		
		e1.display();
		
		Emp e2 = new Emp();
		e2.name = "Aditya";
		e2.age = 22;
		e2.mobile = 3476379308l;
		e2.empId = 343;
		
		e2.display();
		
	}

}
