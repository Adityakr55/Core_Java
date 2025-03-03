package com.Interface;
import java.util.*;

interface Car{
	void start();
	void acc();
	void stop();
}

class Bmw implements Car{

	@Override
	public void start() {
		System.out.println("Bmw Started");
		
	}

	@Override
	public void acc() {
		System.out.println("Bmw accelerated");
		
	}

	@Override
	public void stop() {
		System.out.println("Bmw Stopped");
		
	}
	
	void autopilot() {
		System.out.println("Bmw autopilot");
	}
	
}

class Benz implements Car{

	@Override
	public void start() {
		System.out.println("Benz started");
		
	}

	@Override
	public void acc() {
		System.out.println("Benz accelerated");
		
	}

	@Override
	public void stop() {
		System.out.println("Benz Stopped");
		
	}
	void abs()
	{
		System.out.println("Benz abs");
	}
	
}

class Audi implements Car{

	@Override
	public void start() {
		System.out.println("Audi started");
		
	}

	@Override
	public void acc() {
		System.out.println("Audi accelerated");
		
	}

	@Override
	public void stop() {
		
		System.out.println("Audi Stopped");
	}
	
	void gps()
	{
		System.out.println("Audi gps");
	}
	
}

class Carselector{
	public static Car getCar()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Bmw\n2.Benz\n3.Audi\n4.Empty");
		System.out.println("Select a car :");
		int i = sc.nextInt();
		
		if(i == 1)
		{
			return new Bmw();
		}
		if(i == 2)
		{
			return new Benz();
		}
		if(i == 3)
		{
			return new Audi();
		}
		
		else
			return null;
	}
	
	public static void driveCar(Car c)
	{
		c.start();
		c.acc();
		if(c instanceof Bmw)
		{
			Bmw b =(Bmw)c;
			b.autopilot();
		}
		else if(c instanceof Benz)
		{
			Benz b = (Benz)c;
			b.abs();
		}
		else if(c instanceof Audi)
		{
			Audi a = (Audi)c;
			a.gps();
		}
		c.stop();
	}
}
public class CarDriver {
	public static void main(String[] args)
	{
		Car c = Carselector.getCar();
		Carselector.driveCar(c);
	}
}
