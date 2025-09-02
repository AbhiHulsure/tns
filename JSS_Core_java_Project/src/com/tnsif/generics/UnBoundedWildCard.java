package com.tnsif.generics;

import java.util.*;
public class UnBoundedWildCard {

	public static void display(List<?> list) {
		for(Object ele:list) {
			System.out.println(ele);
		}
	}
}
