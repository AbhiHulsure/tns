package com.tnsif.generics;

import java.util.*;
public class UpperBoundedWildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> intList=new ArrayList<>();
		intList.add(22);
		intList.add(33);
		System.out.println(UpperBoundedWildCard.sumOfList(intList));
		
		ArrayList<Float> floatList=new ArrayList<>();
		floatList.add(22.32f);
		floatList.add(33.12f);
		System.out.println(UpperBoundedWildCard.sumOfList(floatList));
	}

}
