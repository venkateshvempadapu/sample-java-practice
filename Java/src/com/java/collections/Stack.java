package com.java.collections;

import java.util.Collections;

public class Stack {

	public static void main(String[] args) {

		java.util.Stack<String> obj = new java.util.Stack<String>();

		obj.push("Sai");
		obj.push("Sravan");
		obj.push("Venky");
		obj.add("Bheem");
	

		
		
		System.out.println(obj);
	
		Collections.sort(obj);
		
		obj.pop();
		
		

		System.out.println(obj); // Stack Follows LIFO

	}

}
