package com.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException {
		Student s1 = new Student("Tarak",25,1);
		FileOutputStream f = new FileOutputStream("/Users/aditya/jspider/Jspider-java/FileHandling/Java.txt"); // If the file does not exist, it will be created. If it already exists, the content will be overwritten
		
		// try-with-resources block, automatically closing the ObjectOutputStream.
		try(ObjectOutputStream of = new ObjectOutputStream(f)) { // The ObjectOutputStream converts the object into a byte stream.
			of.writeObject(s1); // This line serializes the Student object s1 and writes it to the file as a byte stream.
			System.out.println("Serialization done");
		}
	}
}
