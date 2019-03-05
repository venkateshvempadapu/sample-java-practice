package com.java.exceptionhadling;

import java.io.IOException;

public class Parent {

	
	 void msg() throws IOException
	 {
		 System.out.println("parent");
		 
	 }  
	 
	 void m2(){}
	
	 public static void main(String args[]) throws IOException{  
		   Parent p=new TestExceptionChild();  
		   p.msg();

		  
		   
		  } 
}

class TestExceptionChild extends Parent{  
	  
	void msg()throws IOException{  
		
	    System.out.println("TestExceptionChild");  
	  }  
	
	void m4(){}
}