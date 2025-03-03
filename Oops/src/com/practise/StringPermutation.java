package com.practise;

public class StringPermutation {
	public static void main(String[] args) {
		String s = "abc";
		int len = s.length();
		
		permutation(s,0,len-1);
		
//		for(int i = 0;i<len;i++) {
//		String s1 = swap(s,0,i); // abc bac cba
//		for(int j = 1;j<len;j++)
//		{
//		String s2 = swap(s1,1,j); // 1. abc acb 2. bac bca 3.cba cab
//		System.out.println(s2);
//		}
//		}


	}
	
	public static void permutation(String s,int st,int end)
	{
		if(st == end) {
			System.out.println(s);
			return;
		}
		for(int i = st;i<=end;i++)
		{
			String s1 = swap(s,st,i);
			permutation(s1,st+1,end);
		}
		
	}
	
	public static String swap(String s,int st,int k)
	{
		char[] ch = s.toCharArray();
		
		char temp = ch[st];
		ch[st] = ch[k];
		ch[k] = temp;
		return new String(ch);
	}
}

