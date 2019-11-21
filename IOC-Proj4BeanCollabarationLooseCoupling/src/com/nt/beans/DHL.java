package com.nt.beans;

public class DHL  implements Courier{
	
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}
	
	public   String  deliver(int oid) {
		return "DHL is delivering  "+oid+" order id products";
	}



}
