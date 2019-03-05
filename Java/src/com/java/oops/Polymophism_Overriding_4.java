package com.java.oops;

public class Polymophism_Overriding_4 {


	final void m1(){
		
		System.out.println("This is Overrriden Method");
	}
	
	public static void main(String[] args) {	
		
		c obj= new c();
		obj.m1();
		
	}
	
	
}

class c extends Polymophism_Overriding_4{
	
/*	
	void m1(){
		
		System.out.println("This is Overriding Method");
	}
	*/
	
	
}