package com.MapFrameWork;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(7, "Thala");
		m.put(null, "Kl");
		m.put(12, null);
		m.put(14, null);
		m.put(18, "King");
		m.put(45, "Hitman");
		m.put(17,"360");
		m.put(18, "Goat");
		System.out.println(m);
	}

}
