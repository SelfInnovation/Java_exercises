package com.java.demo.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {

		Vector vect = new Vector();
		vect.add("Manikanta");
		vect.add("Swamy");
		vect.add("Kolusu");

		
		
//		int[] arr = {1,2,3,5};
		
		Object[] arr = new Object[]{1,2,3,4};
		
		
		Vector <Integer> v2 = new Vector(Arrays.asList(arr));	
		
		System.out.println("Arry Elements in arr- " + arr);
		System.out.println("Arry Elements in v2 - " + v2.size() + " v2 capacity is -" +v2.capacity() );
		
		
		Vector<Integer> v3 = new Vector<>();
		v3.add(12);
		v3.add(null);
		
		System.out.println("value of v3 " + v3);
		
		
		int vectCap = vect.capacity();

		System.out.println("Elemenst in Vect-" + vect);

		Vector v1 = new Vector();
		v1.add("V1-Vector-1");
		v1.add("V1-Vector-2");
		vect.addAll(1, v1);
		v1.addAll(vect);
		System.out.println("Elemenst in Vect -" + vect);
		System.out.println("Elemenst in V1 -" + v1);
		
		
		Object removal= v1.get(1);
		v1.remove(0);
		
		v1.set(1, "v1-vector");
		System.out.println("v1 --" + v1);
		
		v1.removeAll(vect);
		System.out.println(vect.contains("Manikanta"));
		System.out.println("Elemenst in -" + v1);
		System.out.println("get elemenst -" + removal);
		System.out.println(" Value of Ve ctor -- " + vect + "vector Capacity-- " + vectCap);
		
		Collections.synchronizedList(v1);

	}

}
