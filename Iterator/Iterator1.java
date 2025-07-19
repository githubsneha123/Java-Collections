package com.Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator1 {
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("varatha");
		s.add("deva");
		s.add("shauryanga");
		s.add("rajmannar");
		s.add("kahansar");
		s.add("pandit");
		s.add("vishnu");
		System.out.println(s);
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			//System.out.println(i.next());
			String str=i.next();
			if(str=="vishnu")
				i.remove();
		}
		System.out.println(s);
	}

}
