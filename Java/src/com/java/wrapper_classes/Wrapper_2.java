package com.java.wrapper_classes;

public class Wrapper_2 {

	/*************toString Method **************/
	
	public static void main(String[] args) {
		
		//Object Class toString methods gives classname@hashcode
		Wrapper_2 obj=new Wrapper_2();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		//Integer Class(All Wrapper Classes) toString methods gives content of the Object in the form of String 
		Integer i1= new Integer(100);	
		System.out.println(i1);
		System.out.println(i1.toString());
		

	}

}
