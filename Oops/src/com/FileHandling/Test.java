package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		
		// File f = new File("/Users/aditya/jspider/Jspider-java/FileHandling"); //This line is creating an instance of the File class, which represents a file or directory path in the file system
		// System.out.println(f.mkdir()); // This line attempts to create a directory and prints the result to the console.
		
		File f = new File("/Users/aditya/jspider/Jspider-java/FileHandling/Demo.txt");
		System.out.println(f.createNewFile()); // This method attempts to create a new file at the location specified by the File object f.
		
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		
		System.out.println(f.getAbsolutePath());
		
		File f1 = new File("/Users/aditya/jspider/Jspider-java/FileHandling/Java.txt");
		System.out.println(f.renameTo(f1));
	}
}
