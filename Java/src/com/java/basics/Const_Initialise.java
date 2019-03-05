package com.java.basics;

public class Const_Initialise {

	int id;
	String name;
	float sal;
	
	
	Const_Initialise(){
		
		id=1;
		name="SaiTeja";
		sal=1000000;
		
	}
	
	void display(){
		
		
		System.out.println("id	:"+id);
		System.out.println("name	:"+name);
		System.out.println("sal	:"+sal);
		
	}

	public static void main(String[] args) {
		
		
		Const_Initialise j= new Const_Initialise();
		j.display();
		

	}
}
