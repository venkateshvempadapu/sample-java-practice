package com.java.basics;

public class ForLoop {

	public static void main(String[] args) {
		
		int a[]=new int[6];
		a[0]=10;
		a[2]=20;
		a[4]=30;
		
		
	/*	for (int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			System.out.println(i);
		}*/
		
		for(int venky:a)
		{
			System.out.println(venky);
		}
		
			
	/*	char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		for(char i:vowels)
			System.out.println(i);
		*/
		
	}

}
