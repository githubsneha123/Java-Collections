package com.MapFrameWork;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		t.put("sneha", 3);
		t.put("ramesh", 1);
		t.put("saraswathi", 2);
		t.put("kavin", 4);
		t.put("kaniska", 5);
		//System.out.println(t);
		Set<Entry<String,Integer>>e=t.entrySet();
		for(Entry<String,Integer> n:e)
			System.out.println(n);
		
	}

}
