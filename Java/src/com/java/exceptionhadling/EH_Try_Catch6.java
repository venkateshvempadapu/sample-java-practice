package com.java.exceptionhadling;

public class EH_Try_Catch6 {

	public static void main(String[] args) {
	
		int a[]={10,20};
		
		try{
			//System.out.println(10/0);
			System.out.println(a[1]);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception Handled for ArithmeticException.. ");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled for ArrayIndexOutOfBoundsException.. ");
		}
		
		
		
		
		System.out.println("Rest of the Code");

	}

}
