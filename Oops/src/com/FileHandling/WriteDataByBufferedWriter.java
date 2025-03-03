package com.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataByBufferedWriter {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("/Users/aditya/jspider/Jspider-java/FileHandling/Java.txt");
		BufferedWriter bf = new BufferedWriter(f);
		
		bf.write("Jspider");
		bf.newLine();
		bf.write("Qspider");
		System.out.println("Executed");
		bf.close();
	}
}
