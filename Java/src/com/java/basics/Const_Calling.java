package com.java.basics;

public class Const_Calling {
	
	public Const_Calling() {
		this(10);
		
		System.out.println("0-arg Constructor");
		
		
	}

	public Const_Calling(int a) {
		this(10,20);
		System.out.println("1-arg Constructor");
	}

	public Const_Calling(int a, int b) {
	
		System.out.println("2-arg Constructor");
	}
	
	
	public static void main(String[] args) {
		
		Const_Calling t1= new Const_Calling();
		//Const_Calling t2= new Const_Calling(10);
		//Const_Calling t3= new Const_Calling(10,20);

		
	}

}
