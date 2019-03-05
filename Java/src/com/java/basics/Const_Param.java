package com.java.basics;

public class Const_Param {
	
	
	int id;
	String name;
	float sal;
	
	public Const_Param(int a, String b, float c) {
	
		id=a;
		name=b;
		sal=c;
	
	}

	
	void display(){
		
		
		System.out.println("id	:"+id);
		System.out.println("name	:"+name);
		System.out.println("sal	:"+sal);
		
	}
	
		
	public static void main(String[] args) {
		
		
		Const_Param m1= new Const_Param(1,"Sai Teja",10000);
		
		Const_Param m2= new Const_Param(2,"Bheemesh",20000);
		m1.display();
		
		System.out.println();
		
		m2.display();

	}

}
