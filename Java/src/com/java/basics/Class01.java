package com.java.basics;

public class Class01 {

	void m1(){
		System.out.println("m1 from Parent");
	}
	void m2(){
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		
		Child01 ch= (Child01) new Class01();
		
		ch.m1();
		ch.m2();
		ch.m3();
	
	}

}

class Child01 extends Class01{
	
	void m1(){
		
		System.out.println("m1 from Child");
	}
	
	
	void m3(){
		System.out.println("m3");
	}
}