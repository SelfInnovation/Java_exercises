package com.java.demo.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(0, 5);
		
		System.out.println(al.size());
		//al.
		System.out.println(al);
		
		
		Collections.synchronizedList(al);
	}

}
