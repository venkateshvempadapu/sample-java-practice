package com.java.oops;

public class Inheritance_4 {

	Inheritance_4()     {
		
		System.out.println("0-arg Parent Constructor");
	}
	
	Inheritance_4(int a)     {
		
		System.out.println("1-arg Parent Constructor");
	}
	
	public static void main(String[] args) {
	
		
		Child n= new Child();
		
	}

}

class Child extends Inheritance_4{
	
	
	
		Child(){
		//super(); //Child Constructor internally Invokes super() to call parent Class Constructor
		super();
		System.out.println("0-arg Child Constructor");	
		
		}
	
	
}