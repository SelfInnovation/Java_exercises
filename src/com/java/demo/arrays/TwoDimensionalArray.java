package com.java.demo.arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][2];
		int[][] jagArray = new int[5][];

		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 3;
		arr[1][1] = 4;

		arr[2][0] = 5;
		arr[2][1] = 6;

		for (int i = 0; i < arr.length; i++) {
		    System.out.print("[");
		    for (int j = 0; j < arr[i].length; j++) //0<3
		    { 
		        System.out.print(arr[i][j]); //[[0,0], [1, 3], [2, 3], 
		        if (j < arr[i].length - 1) {
		            System.out.print(", "); // Add comma between elements
		        }
		    }
		    System.out.println("]");
		}

	}

}

