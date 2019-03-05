package com.java.strings;

public class ToString_1 {
	
	
	public String toString(){
		
		System.out.println("This is toString Method");
		return null;
	}

	public static void main(String[] args) {
	
		
		ToString_1 obj= new ToString_1();
		System.out.println(obj);			//internally toString method from Object Class executed
		System.out.println(obj.toString());	// toString method executed from Object Class
		
	}

}
