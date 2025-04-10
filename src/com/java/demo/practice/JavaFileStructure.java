/**
 * 
 */
package com.java.demo.practice;

/**
 * @author mkkol
 *
 */
public class JavaFileStructure {

	public static void main(String[] args) {
		
		System.out.println("in Main method");
		  JavaFileStructureOne.main(args);
			/*
			 * JavaFileStructureTwo.main(args); JavaFileStructureThree.main(args);
			 */	
	}
}

 class JavaFileStructureOne{
	public static void main(String[] args) {
		System.out.println("in Main method one ");		
	}
}


 class JavaFileStructureTwo{
	public static void main(String[] args) {
		System.out.println("in Main Two");
	}
}


 class JavaFileStructureThree{
	public static void main(String[] args) {
		//System.out.println("in Main method Three");
	}
}
