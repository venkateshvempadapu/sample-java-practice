package com.java.oops;

public interface Interface_6 {
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	
	
}

 class ImpClass implements Interface_6{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}

	public static void main(String[] args) {
		
		Impclasse obj =new 	Impclasse();
		obj.m1();
	}

}
 
 class Impclasse extends ImpClass{
	 
	 public void m1(){System.out.println("m1 Method implementation");}
 }
 
 