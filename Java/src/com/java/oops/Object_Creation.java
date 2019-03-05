package com.java.oops;

public class Object_Creation {
	
	 public Object_Creation() {
		System.out.println("Test1");
		
	}

	public static void main(String[] args) {
		
		a obj=new a();  //named object creation
		
		new a();  //nameless object creation
		
	}

}

class a extends Object_Creation{
	
	public a() {
		//super()
		System.out.println("Test2");
		
	}
	
}