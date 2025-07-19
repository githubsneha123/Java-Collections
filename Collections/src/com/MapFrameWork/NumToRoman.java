package com.MapFrameWork;

import java.util.HashMap;
import java.util.Map;

public class NumToRoman {
	public static void main(String[] args) {
		int n=1231;
		System.out.println(convert(n));
	}
	public static String convert(int num) {
		String res="";
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "I");
		m.put(4, "IV");
		m.put(5, "V");
		m.put(9, "IX");
		m.put(10, "X");
		m.put(40, "XL");
		m.put(50, "L");
		m.put(90, "XC");
		m.put(100, "C");
		m.put(400, "CD");
		m.put(500, "D");
		m.put(900, "CM");
		m.put(1000, "M");
		int arr[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int value:arr) {
			while(num>=value) {
				num-=value;
				res+=m.get(value);
			}
		}
		return res;
	}

}
