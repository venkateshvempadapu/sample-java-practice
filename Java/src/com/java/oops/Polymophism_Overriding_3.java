package com.java.oops;

public class Polymophism_Overriding_3 {
	
	Inheritance_1 m1(){   //Return type can be Parent type(Non-Primitive)
		
		System.out.println("This is Overriden Method");
		return null;
	}
	
	public static void main(String[] args) {
		
		c1 t= new c1();
	
		t.m1();
	}

}

class c1 extends Polymophism_Overriding_3{
	
	Inheritance_C m1(){  //Return type can be Child type(Non-Primitive)
		
		System.out.println("This is Overriding Method");
		return null;
	}
	
	
	void m2(){
		
		System.out.println("m2 Method");
	}
	
}







