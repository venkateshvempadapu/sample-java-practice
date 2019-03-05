package com.java.wrapper_classes;

public class Wrapper_1 {
	
	/*************Constructor to Create Wrapper Object*************/
	
	/****Converting to primitive or String data to Wrapper Object***/
	public static void main(String[] args) {
		
		Integer i1= new Integer(100);	//int constructor
		System.out.println(i1);
		
		Integer i2= new Integer("100");	//String constructor
		System.out.println(i2);
		
		System.out.println(i1+i2);
		
		Integer i3= new Integer("one");
		System.out.println(i3); //NumberFormatException
		
	}

}
