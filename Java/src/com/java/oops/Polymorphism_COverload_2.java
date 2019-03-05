package com.java.oops;

public class Polymorphism_COverload_2 {
	
	public Polymorphism_COverload_2() {
		System.out.println("This is 0-arg Constructor");
	}

	
	public Polymorphism_COverload_2(int a) {
		System.out.println("This is 1-arg Constructor");
	}
	public static void main(String[] args) {
		
		Polymorphism_COverload_2 obj= new Polymorphism_COverload_2();
		Polymorphism_COverload_2 obj1= new Polymorphism_COverload_2(10);

	}

}
