package com.Collections;

import java.util.Stack;

public class BalancedStringOrNot {

	public static void main(String[] args) {
		System.out.println(isBalanced(""));

	}

	public static boolean isBalanced(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
			}
			else if(ch == ']' || ch == '}' || ch == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				char ch2 = stack.pop();
				if(!isPair(ch2,ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
		
	}

	private static boolean isPair(char ch1, char ch2) {
		if(ch1 == '[' && ch2 == ']' || ch1 == '{' && ch2 == '}' || ch1 == '(' && ch2 == ')') {
			return true;
		}
		else
			return false;
	}

}
