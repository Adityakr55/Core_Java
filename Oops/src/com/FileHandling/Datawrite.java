package com.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Datawrite {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/aditya/jspider/Jspider-java/FileHandling/A.txt");
		
		FileOutputStream f = new FileOutputStream(file,true);
		
		String s = "\n Java is very easy";
		
		byte[] b = s.getBytes();
		
		if(file.canWrite())
			f.write(b);
		else
			System.out.println("Can't write data");
		f.close();
	}
}
