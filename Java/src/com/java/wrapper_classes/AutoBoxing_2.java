package com.java.wrapper_classes;

import java.util.ArrayList;

public class AutoBoxing_2 {

	public static void main(String[] args) {
		
		//Without AutoBoxing
		
		ArrayList a= new ArrayList();
		a.add(new Integer("10"));
		a.add(new Float("10"));
		a.add(new Character('b'));
		a.add(new Boolean("abc"));
		System.out.println(a);
		
		//With AutoBoxing
		
		ArrayList b= new ArrayList();
		b.add(10);
		b.add(10.5);			//Internally valueOf method applied Java Decompiler Software to check
		b.add('b');
		b.add("abc");
		System.out.println(a);
		
		

	}

}
