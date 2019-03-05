package com.java.wrapper_classes;

/*********Wrapper Object to primitive or String using***/

public class Wrapper_To_Other {

	public static void main(String[] args) {
		
		Integer i1= new Integer(129);
		
		//Wrapper Object to primitive using xxxValue()	xxx=all datatypes

		int x=i1.intValue();
		double y=i1.doubleValue();
		Byte z =i1.byteValue() ;
		System.out.println(z);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
		
		System.out.println();
		
		
		//Wrapper Object to String using toString Method
		Integer g1= new Integer(200);
		Integer g2= new Integer("300");
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(g1.toString()+g2.toString());
		
		
	}

}
