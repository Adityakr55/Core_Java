package com.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
		public static void main(String[] args) throws IOException {
			FileInputStream f = new FileInputStream("/Users/aditya/jspider/Jspider-java/FileHandling/A.txt");// If the file does not exist, it throws a FileNotFoundException.
			int n = f.read();
			while(n != -1) {
				System.out.print((char)n);
				n = f.read();
			}
			f.close();
		}
}
