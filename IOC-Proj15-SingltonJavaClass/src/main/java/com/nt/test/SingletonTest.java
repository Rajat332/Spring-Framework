package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonTest {
	public static void main(String[]args) {
		Printer p1=null,p2=null;
		//get Instance/object
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		p1.print("hello");
		p2.print("hiii");
		
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
		
		System.out.println("...........");
		System.out.println("p1==p2?"+(p1==p2));
		
		
		
	}

}
