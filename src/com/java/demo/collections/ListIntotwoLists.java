package com.java.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListIntotwoLists {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(4);
		ll.add(9);
		ll.add(8);
		ll.add(0);
		ll.add(5);
		ll.add(3);
		ll.add(3);
		ll.add(8);
		ll.add(0);
		ll.add(5);
		ll.add(3);
		ll.add(3);

		int halfList = ll.size() / 2;

		System.out.println(halfList);

		List<Integer> fisthalf = new ArrayList(ll.subList(0, halfList));
		List<Integer> secondHalf = new ArrayList<>(ll.subList(halfList, ll.size()));
		System.out.println("Original List" + ll);
		System.out.println("First half list " + fisthalf);
		System.out.println("Second half list " + secondHalf);

	}

}
