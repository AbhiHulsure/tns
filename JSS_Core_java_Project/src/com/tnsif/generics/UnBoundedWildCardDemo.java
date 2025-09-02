package com.tnsif.generics;

import java.util.*;
public class UnBoundedWildCardDemo {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(1,2,3,4);
		UnBoundedWildCard.display(intList);

		
		List<String> strList=Arrays.asList("Hi","Hello","bye");
		UnBoundedWildCard.display(strList);

	}

}
