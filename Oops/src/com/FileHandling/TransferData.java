package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransferData {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("/Users/aditya/jspider/Jspider-java/FileHandling/A.txt");
		FileOutputStream file = new FileOutputStream("/Users/aditya/jspider/Jspider-java/FileHandling/Java.txt",true);
		int n = f.read();
		while(n != -1) {
			file.write(n);
			n = f.read();
		}
		f.close();
		file.close();
	}
}
