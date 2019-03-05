package com.java.oops;

public class Polymorphism_MOverload_1 {
	
	
	void m1(){
		System.out.println("This is 0 arg method");
	}
	
	void m1(int a){
		
		System.out.println("This is 1 arg method");	
	}
	
	void m1(char a){
		
		System.out.println("This is 1 arg method with char");	
	}
	
	

	public static void main(String[] args) {
		
		
		Polymorphism_MOverload_1 obj= new Polymorphism_MOverload_1();
		
		obj.m1();
		obj.m1(10);
		obj.m1('s');

	}

}
