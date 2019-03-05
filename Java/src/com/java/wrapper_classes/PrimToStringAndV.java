package com.java.wrapper_classes;

public class PrimToStringAndV {

	public static void main(String[] args) {
		int a=10;
		float b=20;
		
		
		//Conversion of primitive to String using valueOf() method
		String s1=String.valueOf(a);
		
		String s2=String.valueOf(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);
		
		
		//Conversion of String to primitive
		
		String ss1="45";
		String ss2="46";
		
		int x=Integer.parseInt(ss1);
		double  y=Double.parseDouble(ss2);
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(x+y);
		
		
		
		
		

	}

}
