package com.java.oops;

public abstract class Abstraction_2 {

	abstract void m1();
	abstract void m2();
	void m3() {
	}
	public static void main(String[] args) {
		
		
	}
	
}

abstract class v1 extends Abstraction_2{
	
	void m1() {
	}
}

 class v2 extends v1{   //this is Concrete Class Which implements all of it's methods from Abstract Class
	 					//Ex: ChromeDriver is Concrete Class
	void m2(){
		
	}
}