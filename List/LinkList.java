package com.List;

import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(20);
		l.add(30);
		l.add("sneha");
		l.add(true);
		l.add(2, 700);
		l.set(0, "java");
		//System.out.println(l);
		for(Object n:l)
			System.out.println(n);
	}

}
