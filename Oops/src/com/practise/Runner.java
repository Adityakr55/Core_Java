package com.practise;
import java.util.* ;
import java.io.*; 
class Solution {
    public static void printPattern(int n) {
        int m = n-1;
        int k = (n * (n + 1)) / 2;
        int left = 1; 
       
        
        for (int i = n; i > 0; i--) {
        	 int rightstart = k + (m*(m+1))/2 + 1; 
            for (int j = 0; j < i; j++) {
                System.out.print(left + " ");
                left++;
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print(rightstart + " ");
                rightstart++;
            }
            m--;
            
            System.out.println();
        }
    }
}
public class Runner {
   
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution.printPattern(n);
        sc.close();
        
    }
}

