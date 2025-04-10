/**
 * 
 */
package com.java.demo.practice;

/**
 * @author mkkol
 *
 */
public class Viewer {

	String name;
	Boolean isLiked;
	Boolean isSubscribed;

	public static void main(String[] args) {
		Viewer v1 = new Viewer();
		v1.name = "Manikanta";
		String nam = v1.name;
		v1.isLiked = true;
		//boolean likeStatus = v1.isLiked;
		v1.isSubscribed = true;
		//boolean IsSubscribedstatus = v1.isSubscribed;
		
		System.out.println("name --" + nam + " " + v1.isLiked + " " + v1.isSubscribed);
		v1.thankYou();
		wish();
	}
	
	
	void thankYou(){
		
		/*
		 * if (isLiked = true) { System.out.println("Thank you " + name); }
		 */
		if (isLiked && isSubscribed) {
			System.out.println("user subscribed and liked the videos");
		} else if (isLiked) {
			System.out.println("Thanks for liking");
		}
		else if (isSubscribed) {
			System.out.println("Thanks for subscribing");
		}
		wish();
	}
	
	
	static void wish(){
		System.out.println("in static methid");
	}

}
