package com.java.demo.collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import org.apache.lucene.queries.function.valuesource.ReverseOrdFieldSource;

public class QueuePractice {

	// Adition -- Offer, add
	// Retrival -- peek
	// Removal -- Poll, Remove

	public static void main(String[] args) {

		// Priority Queue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		

		pq.add(7);
		pq.add(2);
		pq.add(3);
		pq.add(1);
		pq.add(1);

		pq.offer(5);

		System.out.println(pq);

		pq.peek();
		System.out.println(pq);
		pq.poll();
		pq.poll();

		pq.contains(3);
		
		pq.clear();

		System.out.println(pq);
		
		
		ArrayDeque<String> queStr = new ArrayDeque<>();
		queStr.add("manikanta");
		queStr.add("manikanta");
		queStr.peek();
		queStr.offer("mmm");
		queStr.offerFirst("My offer First");
		
		System.out.println(queStr);
		

	}

}
