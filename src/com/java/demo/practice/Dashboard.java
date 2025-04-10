/**
 * 
 */
package com.java.demo.practice;

/**
 * @author mkkol
 *
 */
public class Dashboard {

	public static void main(String[] args) {
		// calling constructor from Student Class
		System.out.println("initaied main method from Dashboard class");
		Student stu = new Student();
		stu.setName("Mayank");
		stu.setName("Manikanta");
		stu.setId(12444);

		getName(stu);
	}

	/**
	 * @param stu
	 */
	static void getName(Student stu) {
		// TODO Auto-generated method stub

		System.out.println("Student name " + stu.getName());

		House house = new House();

	}

	/**
	 * @param stu
	 */

	void methodOne() {
		System.out.println("In method one Dashboard JAVA");

	}

}