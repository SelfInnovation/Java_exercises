package com.java.demo.arrays;

import java.util.Arrays;

// Single Dimessional Array

//We can re-assign value in array
//Will get ArrayIndexOutOfBoundException but if we go 

public class SingleDimesionalArray {

	/*
	 * //printing the sum of number from given Array public static void
	 * main(String[] args) {
	 * 
	 * int[] arr = { 2, 5, 1, 9, 6 }; int sum = 0; int j = 0; int count = 0; for (j
	 * = 0; j < arr.length; j++) { sum += arr[j]; count = sum; }
	 * System.out.println("The sum of array is  " + count); }
	 */

	// Print the average of integer in the given array.
//	public static void main(String[] args) {
	// int arr[] = { 2, 5, 3, 9, 5 };
	// int sum = 0;
	// double average = 0;

	// for (int i = 0; i < arr.length; i++) {

//			sum += arr[i];
	// Average of the integer
	// average = (double) sum / arr.length;

	// }
	// System.out.println("Sum of Arr value is " + sum);
	// System.out.println("Average of the given Array is " + average);
	// }

	/*
	 * public static void main(String[] args) { String arr1[] = { "chai", "cofee" };
	 * String arr2[] = { "milk", "water", "coke" }; String arr3[] = { "pepsi",
	 * "Cold Drinks" }; String arr4[] = { "Diet" }; String[] mergedArray = new
	 * String[arr1.length + arr2.length + arr3.length + arr4.length];
	 * 
	 * o/p should be = {"chai", "cofee", "milk", "water", "coke" }
	 * 
	 * System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
	 * System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
	 * System.arraycopy(arr3, 0, mergedArray, arr1.length + arr2.length,
	 * arr3.length); System.arraycopy(arr4, 0, mergedArray, arr1.length +
	 * arr2.length + arr3.length, arr4.length);
	 * 
	 * System.out.println("Merged value is " + Arrays.toString(mergedArray));
	 * 
	 * }
	 */

	// find the max number from an array and print in along with index
	/*
	 * public static void main(String[] args) {
	 * 
	 * int arr[] = { 2, 5, 1, 9, 6 }; // int max = numbers[0];
	 * 
	 * int max = arr[0]; // System.out.println("value of max " + max); int index =0;
	 * 
	 * for (int i = 0; i < arr.length; i++) { if (arr[i] > max) {
	 * 
	 * // 2 > 2, 5>2 - true, // 2 5 1 9 6
	 * 
	 * max = arr[i]; index = i; }
	 * 
	 * } System.out.println("Highest number: " + max);
	 * System.out.println("Index position: " + index);
	 * 
	 * }
	 */

	// find the min length word from an array and print it along with its Index
	// public static void main(String[] args) {
	// String[] words = {"apple", "banana", "dog","hi", "cat"};

	// String minWord = words[0];
	// int index = 0;

	// for (int i = 1; i < words.length; i++) {
	// 1<4 -->
	// if (words[i].length() < minWord.length()) {
	// minWord = words[i];
	// index = i;
	// }
	// }

	// System.out.println("Shortest word: " + minWord);
	// System.out.println("Index position: " + index);
	// }

	// reverese the array and print in console
	public static void main(String[] args) {
		String[] arr = { "mango", "Orange", "Banana" };
		for (int i = arr.length -1; i >= 0; i--) {
			System.out.println("Reverse Array  " +arr[i]);
		}

		

	}
}
