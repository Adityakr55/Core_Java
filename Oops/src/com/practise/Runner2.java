package com.practise;
import java.util.Scanner;

class Solution2 {
    public static void getNumberPattern(int n) {
        int k = n; 
        int rowStart = 0, rowEnd = 2 * n - 2; 
        int colStart = 0, colEnd = 2 * n - 2; 
        int[][] arr = new int[2 * n - 1][2 * n - 1]; 

        while (k > 0) {
           
            for (int col = colStart; col <= colEnd; col++) {
                arr[rowStart][col] = k;
            }
            rowStart++; 

           
            for (int row = rowStart; row <= rowEnd; row++) {
                arr[row][colEnd] = k;
            }
            colEnd--;

            
            for (int col = colEnd; col >= colStart; col--) {
                arr[rowEnd][col] = k;
            }
            rowEnd--; 

           
            for (int row = rowEnd; row >= rowStart; row--) {
                arr[row][colStart] = k;
            }
            colStart++; 

            k--; 
        }

       
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) 
            	{
            		System.out.print(arr[i][j]+"\t");
            	}
            	System.out.println();
            	System.out.println();
            	System.out.println();
            	System.out.println();
            }
            
        }
    }

public class Runner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Solution2.getNumberPattern(n);
        
        sc.close();
    }
}