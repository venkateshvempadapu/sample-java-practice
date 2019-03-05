package com.java.strings;

public class Equals_Method {

	public static void main(String[] args) {

		String s1 ="Bheemesh";
		
		
		String s2 ="Bheemesh";

		System.out.println(s1.equals(s2));
		
		//equals()   ==
		

		StringBuffer g1 = new StringBuffer("Sai");
		StringBuffer g2 = new StringBuffer("Sai");
		
		System.out.println(g1.equals(g2));
		
		
		

		/*Object Class equals() performs reference comparison
		String Class equals() performs content comparison
		StringBuffer Class does not overrides equals()--->Object Class equals() performs reference comparison*/
	}

}
