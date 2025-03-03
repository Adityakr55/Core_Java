package com.MethodOverriding;

class AA{
	Animal m1()
	{
		System.out.println("M1()-AA");
		return new BabyDog();
	}
}

class BB extends AA{
	@Override
	public Dog m1()
	{
		System.out.println("M1()-BB");
		return new BabyDog();
	}
}

class CC extends BB{
	@Override
	public BabyDog m1()
	{
		System.out.println("M1()-CC");
		return new BabyDog();
	}
	
//	@Override
//	public Animal m1() // this is wrong.
//	{
//		System.out.println("M1()-CC");
//		return new BabyDog();
//	}
}
public class Covarient {
	public static void main(String[] args)
	{
		CC c = new CC();
		c.m1();
	}
}
