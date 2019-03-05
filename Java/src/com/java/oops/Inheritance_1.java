package com.java.oops;

public class Inheritance_1 {
	
	void m1()
	{
		
		System.out.println("This is m1 from Inheritance_1");
	}

	
	void m2()
	{
		
		System.out.println("This is m2 from Inheritance_1");
	}
	public static void main(String[] args) {
		
		
		Inheritance_C n= new Inheritance_C(); //Creating Object for Child Class
		
		n.m3(); // Accessing Child Class Method m3
		
		n.m1(); //Accessing Parent Class Method m1 from child class object
		
		n.m2(); //Accessing Parent Class Method m2 from child class object
		
	}

	
	
}
 class Inheritance_C extends Inheritance_1{

	 
		void m3()
		{
			
			System.out.println("This is m3 from Inheritance_C");
		}
	
	
	
}
