package com.java.wrapper_classes;

public class AutoBoxing_1 {

	public static void main(String[] args) {

		/***********Conversion of primitive/String to Wrapper Object**************/
		
		Integer i1 = new Integer("10"); // Using Constructor
		Integer i2 = Integer.valueOf("20"); // Using valueOf Method

		Integer i3 = 30; // AutoBoxing
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println();
		
		
		// Auto UnBoxing
		int x=new Integer(i1);
		int y=new Integer(i2);
		System.out.println(x+y);

	}

}
