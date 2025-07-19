package com.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue1 {
	public static void main(String[] args) {
		Deque<Integer> q=new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(10);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q.pollFirst());
		System.out.println(q.pollLast());
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
		System.out.println(q);
		
	}

}
