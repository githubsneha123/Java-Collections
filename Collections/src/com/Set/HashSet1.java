package com.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("Dosa");
		s.add("Idly");
		s.add("Sambar");
		s.add("Chutny");
		s.add("Chutny");
		System.out.println(s);
	}

}
