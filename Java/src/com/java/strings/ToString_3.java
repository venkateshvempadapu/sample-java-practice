package com.java.strings;

public class ToString_3 {

	
	public String toString(){
		//System.out.println("Test");
		return null;
	}
	public static void main(String[] args) {
		
		
	
		
		String t1="Gurumann";
		System.out.println(t1);
		System.out.println(t1.toString());	// Gives Content of String as String Class overrides Object Class String method
		
		ToString_3 t2=new ToString_3();
		System.out.println(t2);
		System.out.println(t2.toString());	//Gives Content of String as StringBuffer Class overrides Object Class String method
		

	}

}
