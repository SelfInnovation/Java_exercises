package com.java.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
		addingValues();
		
	}

	private static void addingValues() {

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			al.add(i);
		}
		System.out.println(al);
		iteratormethod(al);
	}

	private static void iteratormethod(ArrayList<Integer> al) {
		
		Iterator<Integer> i = al.iterator();
		while(i.hasNext())
		{
System.out.println(		i.next());		
		}
		
		i.next();
		i.remove();
		
		System.out.println(al);
		
			

	}
}
