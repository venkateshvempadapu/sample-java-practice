package com.java.strings;

public class String_2 {
	
	public static void main(String[] args) {
		
		//String s1="Bheemesh";
		String s1=new String("Bheemeshh");
		
		System.out.println(s1.concat("Cirpe"));
		System.out.println(s1);		
		
		StringBuffer sb1=new StringBuffer("Sunil");
		System.out.println(sb1.append("Pawar"));
		System.out.println(sb1);	//String Buffer is mutable in nature 
		
	}

}
