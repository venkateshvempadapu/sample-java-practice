package com.java.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_AllCursors {

	public static void main(String[] args) {

		Vector<Product> obj = new Vector<Product>();

		obj.add(new Product(1, "Book", 100));
		obj.add(new Product(2, "Pen", 200.89));
		obj.add(new Product(3, "Pencil", 300.5882));
		
		//Iterating through Enumeration
		
		Enumeration<Product> e = Collections.enumeration(obj); 
		
		while(e.hasMoreElements()){
			Product p=e.nextElement();
			System.out.println(p.id+" "+p.name+" "+" "+p.cost);
		}
		
		//Iterating through Iterator
		
		Iterator<Product> Itr=obj.iterator();
		while(Itr.hasNext()){
			
			Product p= Itr.next();
			System.out.println(p.id+" "+p.name+" "+" "+p.cost);
		}
		
		//Iterating through ListIterator
		
		ListIterator<Product> lit=obj.listIterator();
		while(lit.hasNext()){
			
			Product p=lit.next();
			System.out.println(p.id+" "+p.name+" "+" "+p.cost);
		}

	}

}

class Product {

	int id;
	String name;
	double cost;

	public Product(int id, String name, double cost) {

		this.id = id;
		this.name = name;
		this.cost = cost;

	}
}