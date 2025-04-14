package com.java.demo.collections;

import java.util.ArrayList;

public class AlSumandAverage {

	// Write a program to print sum and Average of the elements present in list

	public static void main(String[] args) {

		double sum = 0;
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(0);
		al.add(9);
		al.add(8);
		al.add(101);

		// if (al != null) {
		/*
		 * for (i = 0; i < al.size(); i++) { System.out.println("Size of AL is " +
		 * al.size()); sum = sum + al.get(i); }
		 */

		for (int num : al) {
			sum += num;
		}

		System.out.println("Sum of the Given AL is " + sum + " and the average is " + (sum / al.size()));
		// }

	}

}
