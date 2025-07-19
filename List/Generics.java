package com.List;

import java.util.LinkedList;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		List <Integer>l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		//l.add(4.6);//CTE
		//l.add('a');//CTE
		l.add(40);
		System.out.println(l);
		for(Integer n:l)
			System.out.println(n);
	}

}
