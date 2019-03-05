package com.java.strings;

public class Selenium_String_Operations {

	public static void main(String[] args) {
		String s1="BheemesH";
		String s2="bheemesh";
		String s3="Rashi";
		String s4="   Venky Thammana  ";
		
		/*System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith("B"));
		System.out.println(s1.startsWith("V"));
		System.out.println(s2.endsWith("B"));
		System.out.println(s2.endsWith("h"));
		System.out.println(s2.concat(s3));
		System.out.println(s1.charAt(1));
		System.out.println(s3.indexOf("h"));
		System.out.println(s3.contains("k"));
		System.out.println(s3.contains("R"));
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.replaceAll("Thammana", "Nandhini"));*/
		
	
		
		
		String str = "Venky@Janaki@Nandhini@Sowndharya@Thammana@SaiPallavi"; 
		
		
        String[] arrOfStr = str.split("@",6); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
    } 
		
		
	
	}
	
	
	

