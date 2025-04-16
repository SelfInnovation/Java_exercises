package com.java.demo.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumPractice {
	
	public static void main(String[] args) {
		
			Vector<String> v = new Vector<>();
			
			
			v.add("banana");
			v.add("Apple");
			v.add("Mango");
			
	Enumeration<String> str  = v.elements();
	
	while(str.hasMoreElements()) {
		System.out.println(str.nextElement());
	}

	}

}
