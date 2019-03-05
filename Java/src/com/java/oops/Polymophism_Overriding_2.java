package com.java.oops;

public class Polymophism_Overriding_2 {
	
	 void m1(){
		 
		 System.out.println("This is Overriden  Method");
	 }
	

	public static void main(String[] args) {
		
		childd1 obj= new childd1();
		obj.m1();
	}
	
	
}


 class childd1 extends Polymophism_Overriding_2{
	
/*	 int m1(){
		 
		 System.out.println("This is Overriding Method");
	 }
	*/
	
}