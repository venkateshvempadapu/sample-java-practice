package com.java.collections.sorting;

import java.util.Comparator;

public class Pname_Sort implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.pname.compareTo(o2.pname);
	}


}
