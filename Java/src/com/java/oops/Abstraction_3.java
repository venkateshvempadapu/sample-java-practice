package com.java.oops;

public abstract class Abstraction_3 {
	
	abstract void m1();
	abstract void m2();

	void m4(){
		System.out.println("This is m4");
	}
	public Abstraction_3() {
		System.out.println("This is Abstract Class Constuctor");
	}
	
	public static void main(String[] args) {
		
		b obj= new b();
		
		obj.m1();
		obj.m4();
	}

}

class b extends Abstraction_3{
	
	
	public b() {
		//Super()
		System.out.println("This is b Constuctor");
	}
	
	
	void m1(){
		System.out.println("This is m1");
	
	}
	void m2(){
		System.out.println("This is m2");
	}
	
}