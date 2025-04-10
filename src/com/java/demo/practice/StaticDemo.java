/**
 * 
 */
package com.java.demo.practice;

/**
 * @author mkkolusu
 *
 */
public class StaticDemo {

	public static void main(String[] args) {

		Student student1;
		Student student2;
		Student student3;

		student1 = new Student();
		// student1.setName("Student One");
		student1.setStudyClass("2nd year Btech");
		student1.setId(123);
		student1.setName("mani");
		// student1.setMarks(90);
		student1.marks = 90;
		// student1.totalStudents = 1;
		// student1.setCollage("JNTU K");
		System.out.println(student1.getName());
		System.out.println(student1.getStudyClass());
		System.out.println(student1.getId());
		System.out.println(Student.collage);
		System.out.println("marks for Student-1 " + student1.marks);
		// System.out.println("Total number of students-1 :" + student1.totalStudents);

		// System.out.println(student1.getCollage());
		student2 = new Student();
		student2.setName("Student Two");
		student2.setStudyClass("Btech 2nd year");
		student2.setId(256);
		// student2.setMarks(87);
		student2.marks = 87;
		// student2.totalStudents = 2;

		System.out.println(student2.getName());
		System.out.println(student2.getStudyClass());
		System.out.println(student2.getId());
		System.out.println("marks for Student-2 " + student2.marks);
		// System.out.println("Total number of students-2 :" + student2.totalStudents);

		student3 = new Student();
		student3.setName("Student Three");
		student3.setStudyClass("Btech 2nd year");
		student3.setId(369);
		// student3.setMarks(76);
		student3.marks = 76;
		// student3.totalStudents = 3;

		System.out.println(student3.getName());
		System.out.println(student3.getStudyClass());
		System.out.println(student3.getId());
		// System.out.println("marks for Student-3 " + student3.getMarks());
		System.out.println("marks for Student-3 " + student3.marks);
		// System.out.println("Total number of students-3 :" + student3.totalStudents);
		student1.getCountry();
		System.out.println(Student.country);

		System.out.println("Total number of students---"
				+ (Student.totalStudents + Student.totalStudents + Student.totalStudents));
		
		int totalStu = Student.getTotalStudents();
		System.out.println("Total Stu called from static methods --" + totalStu);
		
//		Student.main(args);
	}
	
	

}
