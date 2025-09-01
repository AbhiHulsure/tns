package com.tnsif.generics;

import java.util.ArrayList;

public class WithGenerics {

	public static void main(String args[]) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("JAVA");
		a1.add("C");
		 
		for(String ob:a1) {
			
			System.out.println(ob);
		}
	}
}
