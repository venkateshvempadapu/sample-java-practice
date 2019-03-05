package com.java.basics;

public class Instaceof {


	
	public static void main(String[] args) {
		
		parent p1=new parent();
		parent p2=new child();
		child  c1=new child();
		
		
		//child  c2=(child) new parent();
		
		Object c3= new child();
		
		Object c4=new Object();
		
		System.out.println(p1 instanceof parent);	 //true
		System.out.println(p1 instanceof child);	//false
		
		System.out.println(p2 instanceof parent);	//true
		System.out.println(p2 instanceof child);	//true
		
		System.out.println(c1 instanceof parent);	//true
		System.out.println(c1 instanceof child);	//true
		
		System.out.println(c3 instanceof child);
		System.out.println(c4 instanceof child);
		
		
		
	}

}

class parent
{
	
}

class child extends parent
{
	
}
