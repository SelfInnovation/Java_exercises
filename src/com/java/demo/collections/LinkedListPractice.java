package com.java.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Al-1");

		al.add("al-2");

		LinkedList<String> ll = new LinkedList<>();
		ll.add("Manikanta");
		ll.add("Kolusu");
		ll.add("Manikanta");
		ll.add("Manikanta");
		ll.add(null);
		ll.add(null);
		// System.out.println(ll);

		// ll.addAll(4, al);

		ll.addLast("ll-last");
		System.out.println(ll);

		ll.addAll(al);
		// li.add(100);
		Collections.synchronizedList(ll);
		
		
		System.out.println(ll);
	}

}
