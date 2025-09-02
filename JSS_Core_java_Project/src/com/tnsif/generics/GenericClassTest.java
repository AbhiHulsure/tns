package com.tnsif.generics;

public class GenericClassTest {

	public static void main(String args[]) {
		GenericClass<String> ob=new GenericClass<>();
		ob.set("JAVA");
		
		GenericClass<Integer> ob1=new GenericClass<>();
		ob1.set(123);
		
		
	}
}
