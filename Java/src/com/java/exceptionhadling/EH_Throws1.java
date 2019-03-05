package com.java.exceptionhadling;

public class EH_Throws1  {
	
	
	public void  m2()  {
		
		System.out.println(10/0);
		
	}
	
	
	public void m1(){
		
		EH_Throws1 obj=new EH_Throws1();
		try {
			
			obj.m2();
		} catch (Exception e) {
			System.out.println("Exception handled in m1 for m2");
		}
		
	
	}

	public static void main(String[] args) {
		
		
		EH_Throws1 obj=new EH_Throws1();
		
		obj.m1();
		
		
	/*	try{
			
		}
		catch (Exception e) {
			System.out.println("Exceptio handled");
		}*/

	}

}
