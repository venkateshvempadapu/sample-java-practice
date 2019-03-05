package com.java.basics;

public class Const_Nodefault {
	
	
Const_Nodefault(){
		
		System.out.println("0-arg Constructor");
		
	}
	
	 Const_Nodefault(int a){
		 
		//this();  //System will not generate 0-arg constructor if create atleast one constructor
		 
		System.out.println("1-arg Constructor");
	}
	

	public static void main(String[] args) {
		
		
		
		Const_Nodefault h1= new Const_Nodefault();
		Const_Nodefault h2= new Const_Nodefault(10);
		
		
	}
	
	
}
