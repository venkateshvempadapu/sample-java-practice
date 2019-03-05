package com.java.oops;

public class Polymophism_Overriding_6 {

	private void mm1(){
		
		System.out.println("This is private m1 Method");
	}

	public static void main(String[] args) {
		Polymophism_Overriding_6 t= new bc1();
		t.mm1();
	}

}

 class bc1 extends Polymophism_Overriding_6{
	
	 void mm1(){
			System.out.println("Overriding Private Method");
	}
}
