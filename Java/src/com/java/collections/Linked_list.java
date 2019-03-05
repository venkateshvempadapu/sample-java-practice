package com.java.collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
	
		LinkedList<String> ll=new LinkedList<String>();
		
		
		ll.add("Venky");
		ll.add("Sravan");
		ll.add("Bheem");
		
		Iterator<String> itr=ll.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	  Collections.sort(ll);
	  
	  Iterator<String> itr2=ll.iterator();
	  
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		

	}

}
