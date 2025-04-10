/**
 * 
 */
package com.java.demo.stringPractice;

/**
 * @author mkkol
 *
 */
public class TypeCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object obj = new Object();
		String str = new String("Manikanta");
		
		//String Str2 = (String) obj ;
		Object str2 = (Object) obj;
		System.out.println("String value is-" + str2);
		System.out.println(str2.getClass());
		
//		A b = (C) D;
	}

}
