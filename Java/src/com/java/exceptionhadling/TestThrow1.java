package com.java.exceptionhadling;

public class TestThrow1   {

	   static void validate(int age) throws Venky{  
		     if(age<18)  
		      throw new Venky();  
		     else  
		      System.out.println("welcome to vote");  
		   }  
	   
	   
		   public static void main(String args[]) throws Venky{  
		      validate(21);  
		      System.out.println("rest of the code...");  
		  }  
	
	
}

class Venky extends Exception{
	
	
}