/**
 * 
 */
package com.java.demo.interfaceImplements;

import com.java.demo.interfaces.TestInterface;

/**
 * @author mkkol
 *
 */
public class TestInterfaceImp implements TestInterface {
	
	public static void main(String[] args) {
		TestInterfaceImp ti = new TestInterfaceImp();
		ti.m1();
		ti.m2();
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Line 17");
		//ti.m2();
	}

	@Override
	public void m2() {
		System.out.println("Line 17 in m2");
	}

}
