package com.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
	public static void main(String[] args) throws IOException {
		File file = new File("/users/aditya/jspider/Jspider-java/FileHandling/A.txt");
		
		FileWriter f = new FileWriter(file);
		
		if(file.canWrite()) {
			f.write("Jspider\n");
			f.write("Qspider\n");
			f.write("PySpiders\n");
			f.write("ProSpider\n");
			f.write("Gspider\n");
		}
		else {
			System.out.println("Can't write");
		}
			System.out.println("Executed");
			f.close();
	}
}
