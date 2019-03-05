package com.java.collections;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Bheem");
		lhs.add(10);
		lhs.add("Teja");
		lhs.add(20);
		System.out.println(lhs);  //Insertion Order is Preserved
		
		
		LinkedHashSet lhs1=new LinkedHashSet();
		lhs1.add("Bheem");
		lhs1.add(10);
		lhs1.add("Bheem");
		lhs1.add(20);
		System.out.println(lhs1);  //Duplicates not allowed (First occurrence will be considered next occurrences will be Ignored)
		

	}

}
