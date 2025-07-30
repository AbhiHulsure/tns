package com.tnsif.packageTwo;

import com.tnsif.packageOne.Base;

public class Executor {

	public static void main(String[] args) {
		Base b=new Base();
		b.varPublic=12;
		b.methodPublic();
	}
}