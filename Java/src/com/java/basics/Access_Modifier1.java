package com.java.basics;
import com.java.oops.Access_Modifier3;

public class Access_Modifier1 {
	
	int a=10;  //Instance variable 

	static int b=20;  // Static Variable
	 
	void method1()
	{
		int c=30;
		System.out.println("This is method 1 from basic java package Class 1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(Access_Modifier2.m);
		System.out.println(Access_Modifier3.y);
	}

	
	void method2()
	
	{
		int d=40;
		System.out.println("This is method 2 from basic java package Class 1");
	}

	
	public static void main(String[] args) {
	
		Access_Modifier1 u= new Access_Modifier1();
		Access_Modifier2 h= new Access_Modifier2();
		Access_Modifier3 t= new Access_Modifier3();
		
		
	//System.out.println(b);
	//System.out.println(u.a);
	//System.out.println(b);		
	//System.out.println(Access_Modifier3.y);  //Printing Static variable from other class
	//System.out.println(t.x);				//Printing instance variable from other class	
		
	/*	u.method1();
		h.method1();
		t.method3();*/
	
	
	
	}
	
	
	
}
