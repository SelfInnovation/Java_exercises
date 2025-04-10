/**
 * 
 */
package com.java.demo.practice;

/**
 * @author mkkol
 *
 */
public class Party {

	/**
	 * @param args
	 */

	int cost;
	String time;
	String date;
	String adress;

	public int getCost() {
		return cost;
	}

	public String getTime() {
		return time;
	}

	public String getDate() {
		return date;
	}

	public String getAdress() {
		return adress;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Party party = new Party();
		Party party1 = new Party();
		
		party.setCost(1000000);
		party1.setCost(111);
		
		
		System.out.println("The cost for Function is " + party.getCost());
		System.out.println("The cost for Function is " + party1.getCost());

	}

}
