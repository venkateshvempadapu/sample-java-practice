package com.java.basics;

public class Constructor_WArgs {
	
	
	 Constructor_WArgs() {
		 
		
		 System.out.println("This is 0 arg constructor");
	}

	 Constructor_WArgs(int a) {
		 
			
		 System.out.println("This is 1 arg constructor");
	}
	 
	 
	 
	public static void main(String[] args) {
		
		Constructor_WArgs t1= new  Constructor_WArgs();
		Constructor_WArgs t2= new  Constructor_WArgs(10);
		
		
		
	}

}
