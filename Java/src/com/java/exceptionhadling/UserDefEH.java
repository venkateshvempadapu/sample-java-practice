package com.java.exceptionhadling;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class UserDefEH {

	
	static void status(int age) throws InvalidageException {
		
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		
		else{
			
				
				throw new InvalidageException("error vachindi ra ayya");
				
		
			}
			
		}
		
	
	
	
	
	public static void main(String[] args) throws InvalidageException  {
	
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Age");
		int age=s.nextInt();
			
		UserDefEH.status(age);
		

	}

}


class InvalidageException extends Exception{

	public InvalidageException(String string) {
		super(string);
		//System.out.println(string);
		
	}
	
	//default constructor 
}

