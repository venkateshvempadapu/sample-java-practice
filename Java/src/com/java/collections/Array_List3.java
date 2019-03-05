package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List3 {

	public static void main(String[] args) {
		
		ArrayList<String> a= new ArrayList<String>();
		
		a.add("Abhi");
		a.add("Bheem");
		a.add("Teja");
		//a.add(10);
		//a.add(1, null);
		a.add(3, "test");
		System.out.println(a);
		
		//ListIterator Cursor
		
		ListIterator<String> i=a.listIterator();
		
		while(i.hasNext()){
			
			
			System.out.println(i.next());
			
		}
	
	}
}
