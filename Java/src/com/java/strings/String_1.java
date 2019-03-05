package com.java.strings;

public class String_1 {

	public static void main(String[] args) {
		
		//To Create String Object (there are two approaches)
		
		String s1="Bheemesh";   //Objects are created in String Constant Pool(SCP)
		
		String s2=new String("Bheem"); //Objects are created in Heap Memory
		
		
		
		String h1="Bheemesh";  //s1,h1 maps to same area in SCP
		String h2=new String("Bheem"); //s2,h2 maps separate area in Heap Memory
		
		System.out.println(s1==h1);		//reference Comparison
		System.out.println(s2==h2);		//reference Comparison
				
		//To Create String Buffer  (there is only approach)
		
		StringBuffer ss1=new StringBuffer("SaiTeja");
		

	}

}
