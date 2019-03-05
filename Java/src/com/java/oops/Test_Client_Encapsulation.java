package com.java.oops;

public class Test_Client_Encapsulation {

	public static void main(String[] args) {
	
		
		Encapsulation eb1=new Encapsulation();
		
		//Setters are used to set the data
		eb1.Seteid(100);
		eb1.Setename("Bheemesh");
		
		//Getters are used to get the data
		int a=eb1.Geteid();
		String b=eb1.Getename();
		System.out.println(a);
		System.out.println(b);
		
		
		Encapsulation eb2=new Encapsulation();
		
		eb2.Seteid(101);
		eb2.Setename("SaiTeja");
		
		//Getters are used to get the data
		int a1=eb2.Geteid();
		String b1=eb2.Getename();
		System.out.println(a1);
		System.out.println(b1);

	}

}
