package com.java.basics;

public class TypeCasting {

	public static void main(String[] args) {
		
		B b=new B();
		b.m1();
		b.m2();
		
		A a=new B();	//A a=b;
		a.m1();
		
		

	}

}

class A {
	
	public void m1(){
		System.out.println("method from A");
	}
}

class B extends A {
	
	public void m2(){
		System.out.println("method from B");
	}
	public void m1(){
		System.out.println("method from B");
	}
	

}

