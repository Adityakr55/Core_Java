package com.JSP.Object;
import java.util.Scanner;

public class DecimaltoOctal {

		public static int fun(int n)
		{
			int oct = 0;
			int place = 1;
			while(n >0)
			{
				int r = n%8;
				n /= 8;
				oct = oct + r*place;
				place *= 10;
			}

			return oct;
		}

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a decimal no:");
			int n = sc.nextInt();
			System.out.println("Octal number is:"+fun(n));
			
			sc.close();
		}
}
