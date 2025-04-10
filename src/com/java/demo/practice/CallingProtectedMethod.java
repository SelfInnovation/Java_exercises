/**
 * 
 */
package com.java.demo.practice;

import com.java.demo.test.ProtectedValidation;

/**
 * @author mkkol
 *
 */
public class CallingProtectedMethod {

	public static void main(String[] args) {
		System.out.println("inside method");
		// ProtectedValidation pv = new ProtectedValidation();
		CallingProtectedMethod cpmmm = new CallingProtectedMethodOne();
		((CallingProtectedMethodOne) cpmmm).methodOne();
		CallingProtectedMethod cpm = new CallingProtectedMethodOne();
	}

	/**
	 * 
	 */
	public void mainclass() {

		System.out.println("In main class Method");
	}
}

class CallingProtectedMethodOne extends CallingProtectedMethod {

	public void methodOne() {
		System.out.println("In method one");
		CallingProtectedMethod cpm = new CallingProtectedMethodOne();
		cpm.mainclass();

		
		CallingProtectedMethodOne nvvn = new CallingProtectedMethodOne();
		
		nvvn.mainclass();
	}

}
