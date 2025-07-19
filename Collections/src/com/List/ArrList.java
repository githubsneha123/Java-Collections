package com.List;

import java.util.ArrayList;

public class ArrList {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add("sneha");
		a.add(true);
		System.out.println(a);
		ArrayList b=new ArrayList();
		b.add(500);
		b.addAll(a);
		b.add(40);
		System.out.println(b);
		System.out.println(b.contains(500));
		//b.removeAll(a);
		b.retainAll(a);
		System.out.println(b);
		System.out.println(b.size());
	}

}
