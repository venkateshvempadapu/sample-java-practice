package com.java.basics;

import java.util.ArrayList;

public class Reference_Varible {

	public static void main(String[] args) {
		
		ArrayList obj=new ArrayList();
		
		obj.add("Venky");
		obj.add(1);
		obj.add('c');
		obj.add(12.1234);
		
		
		
		for( Object a : obj)
		{
			System.out.println(a);
		}
			
			
		
		
		
		
	}

}
