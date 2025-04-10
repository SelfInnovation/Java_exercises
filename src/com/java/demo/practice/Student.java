/**
 * 
 */
package com.java.demo.practice;

/**
 * @author mkkol
 *
 */
public class Student {

	String name;
	int id;
	String studyClass;
	double percentage;
	House hou;
	static String collage = "JNTU K - SSIET";
	String city;
	int marks;
	static int totalStudents;
	
	
	
	static int getTotalStudents(){
		return totalStudents;
	}
	
	 
	/*
	 * public int getMarks() { return marks; }
	 * 
	 * public void setMarks(int marks) { this.marks = marks; }
	 */

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	static String country = "India";

	/*
	 * void setCollage(String collage) { this.collage = collage; }
	 * 
	 * String getCollage() { return collage; }
	 */

	public Student() {
		System.out.println("initiated Student Constructor");
		totalStudents = totalStudents+1;
		// sampleMethod();
	}

	void sampleMethod() {
		System.out.println("I'm in Student class in sample method");
	}

	// Student s = new Student();

	public void setHou(House hou) {
		this.hou = hou;
	}

	public House getHou() {
		return hou;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getStudyClass() {
		return studyClass;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStudyClass(String studyClass) {
		this.studyClass = studyClass;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public static void main(String[] args) {

	}

	/**
	 * 
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 */
	

}