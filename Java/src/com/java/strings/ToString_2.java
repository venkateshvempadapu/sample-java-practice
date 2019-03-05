package com.java.strings;

public class ToString_2 {

	int eid;
	String ename;

	ToString_2(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	public String toString() {

		return eid + "-" + ename;

	}

	public static void main(String[] args) {

		ToString_2 obj = new ToString_2(100, "Bheemesh Cirpe");
		System.out.println(obj);

		ToString_2 obj1 = new ToString_2(101, "SaiTeja");
		System.out.println(obj1.toString());
	}

}
