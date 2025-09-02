package com.tnsif.generics;

import java.util.*;
public class UpperBoundedWildCard {

	public static double sumOfList(ArrayList<? extends Number> a1) {
		 double sum=0.0;
		 for(Number n:a1) {
			 sum+=n.doubleValue();
		 }
		 return sum;
	}
}
