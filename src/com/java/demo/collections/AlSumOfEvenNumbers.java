package com.java.demo.collections;

import java.util.ArrayList;
import java.util.Collections;

public class AlSumOfEvenNumbers {

	// To print the sum of even number in list
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(0);
		al.add(9);
		al.add(8);
		al.add(2);

		int sum = 0;

		System.out.println(al);

		/*
		 * for (int i = 0; i < al.size(); i++) { if ((al.get(i) % 2) == 0) {
		 * 
		 * sum += al.get(i);
		 * 
		 * }
		 * 
		 * } System.out.println("Sum of Even Numbers is " + sum);
		 */

		for (int evenNumber : al) {
			if (evenNumber % 2 == 0) {
				sum += evenNumber;

			}

		}
		System.out.println("Sum of Even Numbers is " + sum);
Collections.synchronizedList(al);
	}

}
