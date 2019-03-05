package com.java.collections;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet hs1=new HashSet();
		
		hs1.add(10);
		hs1.add("Bheemesh");
		hs1.add(10);  //Duplicate
		hs1.add("Bheemesh");
		hs1.add("Bheemesh");
		hs1.add("venky Thammana");
		System.out.println(hs1);  //Duplicates not Allowed (Set Classes Duplicates not allowed)
		
		HashSet hs=new HashSet();
		
		hs.add(10);
		hs.add("Bheemesh");
		hs.add(10.5);
		
		System.out.println(hs); //Insertion Order not Preserved (HashSet Insertion Order Not Preserved)
		
		
		

		
		

	}

}
