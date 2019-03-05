package com.java.exceptionhadling;

public class EH_Try_Catch1 {

	public static void main(String[] args) {
	
		try{
			System.out.println("No Exeption");
			
			//System.out.println(10/0);
			
		}
	
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		
		System.out.println("Rest of the Code..");
		}

}
