package com.java.oops;

public class Inheritance_2 {
	
	
void m1(){
		
		System.out.println("Method m1 from Parent");
	}


	public static void main(String[] args) {
	
	Inheritance_c2 h=new Inheritance_c2();  //Object Creation for Child2
	h.m1();
	h.m2();
	h.m3();


}


}


class Inheritance_c1 extends Inheritance_2{
	
	
	void m2(){
		
		System.out.println("Method m2 from Child1");
	}
}

class Inheritance_c2 extends Inheritance_c1{
	
	
	


	
	void m3(){
		
		System.out.println("Method m3 from Child2");
	}
	

}