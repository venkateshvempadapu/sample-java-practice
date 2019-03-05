package com.java.basics;

public class Const_This {

	int id;
	String name;
	float sal;
	
	
	public Const_This() 
	{
		System.out.println("id	:"+id);
		System.out.println("name	:"+name);
		System.out.println("sal	:"+sal);
	
		
	}
	
	public Const_This(int id, String name, float sal) {
		
		this.id=id;
		this.name=name;
		this.sal=sal;
		
		
		
	}

	
	void display(){
		
		
		System.out.println("id	:"+id);
		System.out.println("name	:"+name);
		System.out.println("sal	:"+sal);
		
	}
	
	
	public static void main(String[] args) {
		
		
		Const_This m1=new Const_This(1, "Sunil", 123);
		Const_This m2=new Const_This(2, "Saikiran", 321);
		Const_This m3=new Const_This();
		
		m1.display();
		System.out.println();
		m2.display();
		

	}

}
