/**
 * 
 */
package com.java.demo.practice;

/**
 * @author mkkol
 *
 */
public class VariblesDemo {

	static int e = 1;

	static int marks;
	

	
	/*
	 * int a = 100; int b = 200;
	 * 
	 * int absum = a+b;
	 */
	public static void main(String[] args) {
		System.out.println("Varibles Demo");

		int a;
		int b;
		int c;
		int d;

		a = 10;
		b = 20;
		c = -20;
		d = 200;
		e = 10000;

		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);

		System.out.println("value of c is " + c);
		System.out.println("value of d is " + d);
		System.out.println("value of e is " + e);

		int absum = a + b;
		c = absum;
		System.out.println("value of c is " + c);

		Student student1 = null;
		System.out.println("The value of Student is " + student1);

		usingEvarible();
		
		try {
			System.out.println(marks);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	static void usingEvarible() {
		System.out.println("value of a is " + marks);
		e = 50;
		System.out.println("Using E varible method " + e);
	}

}
