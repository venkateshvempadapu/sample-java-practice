package com.java.exceptionhadling;

public class EH_Try_Catch3 {

	public static void main(String[] args) {
		
		try{
			//System.out.println("No Exception ");
			
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
		finally{
			
			System.out.println("Finally with Exception");
		}
		
		//////////////////////////////////////////////
		
		try{
			System.out.println("No Exeception");
			
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		finally{
			
			System.out.println("Finally without Exception");
		}
		

	}

}
