package com.ExceptionHandling;

public class InsufficientBalException extends Exception {
	public InsufficientBalException(String s)
	{
		super(s);
	}
	
	public InsufficientBalException()
	{
		super("Less Bal");
	}
}
