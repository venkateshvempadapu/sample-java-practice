package com.java.oops;

public interface interface8 {

	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
		
}

class Adaptor implements interface8{
	
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
}

class venky extends Adaptor{
	
	public void m1(){
		
		System.out.println("Test1");
	}
	public void m2(){
		
		System.out.println("Test2");
	}
}


class bheem extends Adaptor{
	
	public void m3(){
		
		System.out.println("Test1");
	}
	public void m4(){
		
		System.out.println("Test2");
	}
}