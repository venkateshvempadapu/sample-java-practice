package com.java.collections;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add(20);
		 //ts.add("Bheem");
		ts.add(10);
		// ts.add("Teja");
		ts.add(30);
		System.out.println(ts); // TreeSet Data Must be Homogeneous and must Implement Comparable Interface

		TreeSet ts1 = new TreeSet();
		ts1.add("Bheem");
		ts1.add("Teja");
		ts1.add("Abhi");
		System.out.println(ts1);
		
		
	}

}
