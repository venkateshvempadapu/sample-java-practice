package com.java.basics;

public class Const_default {
	
	
	int id;
	String name;
	float sal;
	
	void display(){
		
		
		System.out.println("id	:"+id);
		System.out.println("name	:"+name);
		System.out.println("sal	:"+sal);
		
	}

	public static void main(String[] args) {
		
		
		Const_default j= new Const_default();
		j.display();
		

	}

}
