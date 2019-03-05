package com.java.oops;

public interface Interface_7 {
	void m1();
	void m2();

	public static void main(String[] args) {
		BB obj=new BB();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
	
}

class AA {
	
	void m3(){
		System.out.println("m3");
	}
	

	
}

class BB extends AA implements Interface_7,Interface_1{
	
	public void m1(){
		System.out.println("m1");
		}
	public void m2(){
		System.out.println("m2");
	}
	
	void m4(){
		System.out.println("m4");
	}
	
	

	
}



/*class C  implements Interface_7  extends A{
	
	public void m1(){}
	public void m2(){}
	
	void m4(){}
	
}*/