package com.java.oops;

public class Polymophism_Overriding_1 {
	
	 void m1(){
		 
		 System.out.println("This is Overriden  Method");
	 }
	

	public static void main(String[] args) {
		
		child1 obj= new child1();
	/*	Polymophism_Overriding_1 obj1= new child1();
		Polymophism_Overriding_1  obj2= new Polymophism_Overriding_1();
		
		child1 obj3=(child1) new Polymophism_Overriding_1();
		*/
		obj.m1();
	}
	
	
}


 class child1 extends Polymophism_Overriding_1{
	
	  void m1(){
		 
		 System.out.println("This is Overriding Method");
	 }
	
	
}