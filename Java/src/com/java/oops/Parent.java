package com.java.oops;

public class Parent {
	
	 void m1(){
		
		System.out.println("This is Parent m1");
	}
	 
	 void m3(){
			
		System.out.println("This is Parent m3");
	}

	public static void main(String[] args) {
	
		
		Parent P= new CChild(); //Only Overriding Methods only we can access
		
		P.m1(); //Compile time: Parent Class m1 Run Time: Child Class m1
		
		//P.m2();	//Compile time: Parent Class m2 Run Time: Child Class m2
		P.m3();
		
		
		/*CChild c=(CChild)P;
		
		c.m2();*/
	
	}

}


class CChild extends Parent{
	
	void m1(){
		
		System.out.println("This is Child m1");
	}
	
	void m2(){
		
		System.out.println("This is Child m2");
	}
}