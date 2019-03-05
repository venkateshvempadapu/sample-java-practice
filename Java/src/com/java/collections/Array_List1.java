package com.java.collections;

import java.util.ArrayList;

public class Array_List1 {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		//Array List Storing Heterogeneous Data using autoboxing concept here
		a1.add(10);
		//a1.add(Integer.valueOf(10));
		a1.add(20.5);
		a1.add("Bheem");
		a1.add('c');
		a1.add(10);
		System.out.println(a1);
		System.out.println(a1.toString());
		
		

	}

}
