package com.java.oops;

public class Inheritance_3 {

	
void m1(){
		
		System.out.println("Method m1 from Parent");
	}


	public static void main(String[] args) {
	
	Inheritance_cc2 h=new Inheritance_cc2();  //Object Creation for Child2
	h.m1();
	h.m2();
	h.m3();



}

	
	
}

/*final*/ class Inheritance_cc1 extends Inheritance_3{  
	
	
	void m2(){
		
		System.out.println("Method m2 from CChild1");
	}
}

 class Inheritance_cc2 extends Inheritance_cc1{      // final Keyword for class Inheritance_cc1 prevents inheritance 
	
	void m3(){
		
		System.out.println("Method m3 from CChild2");
	}
	

}