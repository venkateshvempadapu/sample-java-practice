package com.java.wrapper_classes;

public class Wrapper_3 {

	/************* valueOf Method **************/

	/**** Converting to primitive or String data to Wrapper Object ***/

	public static void main(String[] args) {

		Integer i1 = new Integer(100); // int constructor
		System.out.println(i1);

		Integer i2 = new Integer("100"); // String constructor
		System.out.println(i2);

		// Wrapper Object Creation Using valueOf Method

		Integer y1 = Integer.valueOf(10);
		System.out.println(y1);

		Integer y2 = Integer.valueOf("10");
		System.out.println(y2);

	}

}
