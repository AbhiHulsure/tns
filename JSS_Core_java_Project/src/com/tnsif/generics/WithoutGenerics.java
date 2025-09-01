package com.tnsif.generics;

import java.util.ArrayList;

public class WithoutGenerics {

	public static void main(String args[]) {
		ArrayList a1=new ArrayList();
		a1.add("JAVA");
		a1.add(123);
		 
		for(Object ob:a1) {
			String str=(String)ob;
			System.out.println(str);
		}
	}
}
