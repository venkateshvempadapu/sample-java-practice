package com.java.exceptionhadling;

public class EH_Try_Catch4 {

	public static void main(String[] args) {
		
		try{
			
			System.out.println(10/0);
		}
		
		//System.out.println("Test");
		catch (Exception e) {
			System.out.println("Exception Handled");
		}

	}

}
