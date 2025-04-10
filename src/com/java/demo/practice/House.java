package com.java.demo.practice;

public class House {

	int doorNumber;
	String adress;
	String street;
	static String houseno;

	// parameterized constructor
	/*
	 * House(String houseNumber) { houseno = houseNumber; }
	 */

	House() {
		System.out.println("Entered into House constructor");
		Dashboard dashboard = new Dashboard();
		dashboard.methodOne();
	}

	void setDoorNumber(int doorNu) {
		// doorNumber = doorNu;
		this.doorNumber = doorNu;
	}

	void setAdress(String addr) {
		adress = addr;
	}

	void setStreet(String str) {
		street = str;
	}

	int getDoorNumber() {
		return doorNumber;
	}

	String getAdress() {
		return adress;
	}

	String getStreet() {
		return street;
	}

	public static void main(String[] args) {

	}

}
