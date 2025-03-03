package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataByBufferedReader {
	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("/Users/aditya/jspider/Jspider-java/FileHandling/A.txt");
		BufferedReader bf = new BufferedReader(f);
		
		String s =  bf.readLine();
		while(s!= null) {
			System.out.println(s);
			s = bf.readLine();
		}
		bf.close();
	}
}
