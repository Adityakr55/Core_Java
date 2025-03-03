package com.practise;
import java.util.Scanner;

class Solution1 {
    public static void getNumberPattern(int n) {
        int k = n;
        char ch = 'r';
        int row = 0;
        int col = -1;
        int[][] arr = new int[2*n-1][2*n-1];
        for(int j = 1;j<= 2*n - 1;j++)
        {
        	 for(int i = 1;i<=2*n-1;i++)
             {
                switch(ch)
                {
                    case 'r':
                    {
                        col++;
                        arr[row][col] = k;
                        if(col == n*2 - 2 || arr[row][col + 1]!= 0)
                        {
                     	   ch = 'd';
                     	  
                        }
                        break;
                        
                    }

                    case 'd':
                    {
                        row++;
                        arr[row][col] = k;
                        if(row == n*2 - 2 || arr[row - 1][col] != 0)
                        {
     						ch = 'l';
     						
     					}
                        break;
                        
                    }
                    case 'l':
                    {
                        
                        arr[row][col] = k;
                        if(col == 0 || arr[row][col] != 0)
                        {
     						ch = 'u';
     						
     					}
                        col--;
                        break;
                    }
                    case 'u':
                    {
                        row--;
                        arr[row][col+1] = k;
                        if(arr[row][col+1] != 0)
                        {
     						ch = 'r';
     					}
                        break;
                    }
                }
             }
        }
       
        
        for(int i = 0;i<2*n - 1;i++)
        {
        	for(int j = 0;j<2*n -1;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
    }
}

public class Runner1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		Solution1.getNumberPattern(n);
		
		sc.close();
	}
}
