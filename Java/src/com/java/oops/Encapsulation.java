package com.java.oops;

public class Encapsulation {

	private  int eid;
	private String ename;

	// setters (used to set the values to properties)
	public void Seteid(int eid) {
		this.eid = eid;

	}

	public void Setename(String ename) {

		this.ename = ename;
		
	}

	// getters (used to get the values from the properties)
	public int Geteid() {

		return eid;

	}

	public String Getename() {
		return ename;
	}

}
