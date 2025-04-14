package com.java.demo.collections;

import java.util.Stack;
import java.util.Vector;

public class StackPractice{
	
	public static void main(String[] args) {
		
		Stack<String> books = new Stack<>();
		
		System.out.println("Default capacity before assigning objects " + books.capacity());
		
		System.out.println("validating intial stack Object " +books.isEmpty());
		
		books.push("Push-1");
		books.push("Push-2");
		books.push("Push-3");
		books.push("Push-3");
		books.push("Push-3");
		books.push("Push-3");
		books.push("Push-3");
		
		System.out.println("validating intial stack Object " +books.isEmpty());
		
		books.pop();
		books.isEmpty();
		System.out.println("the Objects in stack books collection "+ books);
		
System.out.println("value of Books Object by using Peek method " + books.peek());
		
	}
	
	

}
