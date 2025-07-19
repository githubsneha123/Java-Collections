package com.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		Queue <Integer> q=new ArrayDeque<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(10);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		System.out.println("--------------");
		while(!q.isEmpty())
			System.out.println(q.poll());
		System.out.println("--------------");
		System.out.println(q.isEmpty());
	}

}
