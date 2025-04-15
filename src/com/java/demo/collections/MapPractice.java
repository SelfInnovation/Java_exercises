package com.java.demo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// 1. Wont allow duplicate
//   2. 
public class MapPractice {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();

		Map<Integer, String> m = new Hashtable<>();

		// Adding Values to map

		m.put(560037, "Banglore");
		m.put(750630, "Irving");
		m.put(500063, "Hyderabad");
		m.put(500063, "Hyderabad-new");

		// Retrieval keys from Map
		Set<Integer> keys = m.keySet();
		System.out.println("value of keys" + keys);
		for (Integer key : keys) {
			System.out.println(key + " m.get(key) >>>>" + m.get(key));
		}
		System.out.println();
		// Retreving values from Map

		Collection<String> mValues = m.values();

		for (String value : mValues) {
			System.out.println(value);

		}

		for (Integer key : keys) {
			System.out.println(key + "-----" + m.get(key));

		}
		m.putIfAbsent(500063, "Chennai");
		System.out.println("map " + m);

		Set<Entry<Integer, String>> entries = m.entrySet();
		for (Entry<Integer, String> entry : entries) {
			entry.getKey();
			entry.getValue();
			System.out.println("Key is " + entry.getKey() + " value is " + entry.getValue());

		}

	}
}
