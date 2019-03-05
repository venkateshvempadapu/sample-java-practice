package com.java.oops;

public class I_Clone implements Cloneable {   		//javap to check number of methods
													//javap java.lang.Cloneable and  javap java.lang.Number 
	int a=10;
	int b=20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		I_Clone obj=new I_Clone();
		
	/*	System.out.println(obj.a);
		System.out.println(obj.b);*/
		
		I_Clone obj1= (I_Clone)obj.clone();
		
		obj.a=100;
		obj.b=200;
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.a=1000;
		obj.b=2000;
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
		
		obj.a=555;
		obj.b=666;
		System.out.println(obj1.a);
		System.out.println(obj1.b);
 
	}

}
