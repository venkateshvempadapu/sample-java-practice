package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List2 {

	public static void main(String[] args) {
		
		ArrayList<String> a= new ArrayList<String>();
		
		//With Generics concepts Collections are Type Safe
		
		a.add("Abhi");
		a.add("Bheem");
		a.add("Gurumann");
		//a.add(10);
		//a.add(1, null);
	//	System.out.println(a);
		
		//Iterator Cursor
		
		Iterator<String> i= a.iterator();
		
		while(i.hasNext())
		{
	     System.out.println(i.next());
	     System.out.println(i.hasNext());
		}
		
		
		}
	
		

	}


