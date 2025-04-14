package com.java.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();

		al.add(4);
		al.add(9);
		al.add(8);

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(5);
		al2.add(0);
		al2.add(9);

		ArrayList<Integer> totalAL = new ArrayList<>(al);
		
		
		totalAL.addAll(al2);

		System.out.println(" Array List value is " + totalAL);

	}

}
