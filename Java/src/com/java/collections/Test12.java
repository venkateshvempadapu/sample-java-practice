package com.java.collections;

public class Test12 {
	public int m1(){
		
		//System.out.println("m1 method");
		return 2;
	}
	
	public static int m2(){
		
		//System.out.println("m2 method");
		return 3;
	}
	public static void main(String[] args) {
		
		Test12 obj= new Test12();
		
     System.out.println(obj.m1());
     System.out.println(m2());
     System.out.println(obj.m2());
     System.out.println(Test12.m2());
				
	}
	
}
