package com.ConsChaining;
class M
{
	final static int i;
   static 
   {
	   System.out.println("static from M class");
	   i = 20;
   }
    
   {
	   System.out.println(" non static from M class");
	   // i = 30; // final static variable can only be initialize inside the static block.
   }
}
//class N extends M
//{
//   static 
//   {
//	   System.out.println("static from M class");
//   }
//}

public class Test10 {
	public static void main(String[] args) {
		
		 
		 Test10 t1=new Test10();
		 new M();
		 new M();
	}
	static
	{
		System.out.println("static from Test10 class");
	}
	
	{
		System.out.println("non static from Test10 class");
	}

}
