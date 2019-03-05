package com.java.strings;

public class StringtoStringBuffer {
	


	public static void main(String[] args) {
		
		String s="Bheemesh";
		
		//Conversion of String to StringBuffer
		StringBuffer ss1=new StringBuffer(s);
		
		StringBuffer sk1= ss1.reverse();
		
		String ll=sk1.toString();
		
		System.out.println(ll);
		
		
		
		//Conversion of StrinBuffer to String
		StringBuffer t=new StringBuffer("Bheem");
		String t1=t.toString();
		System.out.println(t1);
		
		

	}

}
