package com.List;

import java.util.Stack;

public class BalancedBrackets_Stack {
	public static void main(String[] args) {
		String s="([]){}";
		System.out.println(isBalanced(s));
	}
	public static boolean isBalanced(String s) {
		Stack <Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char ch1=s.charAt(i);
			if(ch1=='{'||ch1=='('||ch1=='[')
				stack.push(ch1);
			else if(ch1=='}'||ch1==')'||ch1==']') {
				if(stack.isEmpty())
					return false;
				else {
					char ch2=stack.pop();
					if(!isPair(ch2,ch1))
						return false;
				}
			}
		}
		return stack.isEmpty();		
	}
	public static boolean isPair(char ch1,char ch2) {
		if(ch1=='{'&& ch2=='}'||ch1=='('&& ch2==')'||ch1=='['&& ch2==']')
			return true;
		return false;
	}

}
