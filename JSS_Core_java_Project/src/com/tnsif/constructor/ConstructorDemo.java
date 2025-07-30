package com.tnsif.constructor;
import java.util.*;
public class ConstructorDemo {
           
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		Customer c1=new Customer();
		System.out.println(c1);
		
		Customer c2=new Customer("Abhi","Bangalore",23);
		System.out.println(c2);
		
		System.out.println("Enter Customer Name");
		String name=sc.nextLine();
		
		System.out.println("Enter Customer City");
		String city=sc.nextLine();
		
		System.out.println("Enter Customer Id");
		int id=sc.nextInt();
		
		Customer c3=new Customer(name,city,id);
		
		System.out.println(c3);
	}
}
