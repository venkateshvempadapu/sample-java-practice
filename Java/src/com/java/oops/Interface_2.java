package com.java.oops;

public interface Interface_2 { // abstract

	
	void m1(); // public and abstract
	void m2();
	void m3();
	
	int a=10; // public static final
	
}

class i implements Interface_2{
	
	
	//void m1(){}   		//default void m1() reducing permission compile time error
	public void m1(){}
	public void m2(){}
	public void m3(){}
	

}