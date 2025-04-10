/**
 * 
 */
package com.java.demo.test;

/**
 * @author mkkol
 *
 */
public class Calcul {
    public static int calculateSum(int n) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
        	System.out.println("Total value is " + total);
            total = total +  (i * 100);
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 365; // Example input
        int result = calculateSum(n);
        System.out.println(result);
    }
}
