package com.java.exceptionhadling;

public class Class {
	
	 void m2() throws InterruptedException,ArithmeticException  {
		System.out.println("This is m2 method");	
		Thread.sleep(3000);
		System.out.println("This is m2 method Rest of the Code");
	}
	
	
	 void m1() throws InterruptedException  {
		 Class obj =new Class();
		System.out.println("This is m1 method");
		obj.m2();
	}
	
	public static void main(String[] args) throws InterruptedException    {
		System.out.println("This is main Method");
		 Class obj =new Class();
		 obj.m1();	
		System.out.println(" Main Rest of the Code");
	}

}
