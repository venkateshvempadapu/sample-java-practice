package com.java.collections.sorting;


/************* Using Comparable for Sorting ************/

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Sort_1 {

	public static void main(String[] args) {

		LinkedList<Emp> obj = new LinkedList<Emp>();

		obj.add(new Emp(100, "Bheemesh"));
		obj.add(new Emp(102, "Abhi"));
		obj.add(new Emp(101, "Danush"));
		obj.add(new Emp(103, "Chary"));

		Iterator<Emp> itr = obj.iterator();

		while (itr.hasNext()) {
			Emp p = itr.next();

			System.out.println(p.eid + "  " + p.enmae);
		}

		Collections.sort(obj);

		Iterator<Emp> itr1 = obj.iterator();

		while (itr1.hasNext()) {
			Emp p = itr1.next();

			System.out.println(p.eid + "  " + p.enmae);
		}

	}

}

class Emp implements Comparable {

	int eid;
	String enmae;

	public Emp(int eid, String enmae) {
		super();
		this.eid = eid;
		this.enmae = enmae;
	}
	
	
	@Override
	public int compareTo(Object o) {

		Emp e = (Emp) o;
		if (eid == e.eid)
			return 0;
		else if (eid>e.eid)
		
			return -1;
		
		else
			return 1;
			
	}


}