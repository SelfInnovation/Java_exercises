/**
 * 
 */
package com.java.demo.practice;

/**
 * @author mkkol
 *
 */
public class CashProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CashProgram cp = new CashProgram();
		// cp.getChipPackets(80);
		int totalPackets = getChipPackets(50);
		System.out.println("packets given by shop keeper " + totalPackets);
		// calling Student constructor from this method
		new Student();
	}

	static int getChipPackets(int amount) {
		int price = 10;
		int remainingprice = amount % price;
		if (amount % price == 0) {
			int packetPrice = amount / price;
			// System.out.println("The packets are " + packetPrice);
			return packetPrice;
		} /*
			 * else { return "Give me sufficent price"; }
			 */
		return price;

	}

}
