package com.java.collections.sorting;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Sort_2 {

	public static void main(String[] args) {
		
		Vector<Product> obj=new Vector<Product>();
		
		obj.add(new Product(101, "Ata", 123.456));
		obj.add(new Product(100, "Kun", 456.12));
		obj.add(new Product(103, "Coffee", 10));
		
		for (Product p:obj)
			System.out.println(p.pid+" "+p.pname+" "+p.pcost);
		
		
		/***********Sorting with Pid***********/
		
			Collections.sort(obj,new Pid_Sort());
		
		for (Product p:obj)
			System.out.println(p.pid+" "+p.pname+" "+p.pcost);

		}
	
	
	
		/***********Sorting with Pname***********/
	
/*	Collections.sort(obj,new Pname_Sort());
	
	for (Product p:obj)
		System.out.println(p.pid+" "+p.pname+" "+p.pcost);

}*/

}
