package com.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f = new FileInputStream("/Users/aditya/jspider/Jspider-java/FileHandling/Java.txt");
		try(ObjectInputStream of =  new ObjectInputStream(f)){
			Student s = (Student)of.readObject();
			System.out.println(s);
			System.out.println("Deserialization done");
		}
	}
}