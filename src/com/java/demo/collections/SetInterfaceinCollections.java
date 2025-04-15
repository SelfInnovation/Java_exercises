package com.java.demo.collections;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetInterfaceinCollections {

	public static void main(String[] args) {

		HashSet<Integer> hset = new HashSet<>();

		hset.add(11);
		hset.add(13);
		hset.add(12);

		System.out.println(hset);

		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(545);
		ts.add(125);
		ts.add(02);
		ts.add(12);
		
		System.out.println(ts.first());
		
		System.out.println(ts.last());
		
		
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		
		System.out.println(ts);

	}

}
