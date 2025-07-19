package com.Iterator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,20,30,40,50);
		ListIterator<Integer> i=l.listIterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("------------------");
		while(i.hasPrevious())
			System.out.println(i.previous());
		
	}

}
