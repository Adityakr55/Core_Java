package com.Cons;

class Test{
	
	int i;
	int j;
	int k;
	
	Test(){
		
	}
	
	Test(int i){
		this.i = i;
	}
	
	Test(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	
	Test(int i,int j,int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	public void display()
	{
		System.out.println(i + "\n" + j+"\n" +k);
	}
}

public class B {
	public static void main(String[] args)
	{
		Test b1 = new Test();
		b1.display();
		
		Test b2 = new Test(10);
		b2.display();
		
		Test b3 = new Test(10,20);
		b3.display();
		
		Test b4 = new Test(10,20,30);
		b4.display();
	}
}
