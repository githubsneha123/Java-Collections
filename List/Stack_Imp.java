package com.List;

import java.util.Stack;

public class Stack_Imp {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println("--------------");
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println("-------------");
		System.out.println(s.isEmpty());
	}

}
