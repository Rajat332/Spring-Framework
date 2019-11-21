package com.nt.beans;

public class DTDC implements Courier {
public DTDC() {
	System.out.println("DTDC:0-param constructor");
}
	@Override
	public final String deliver(int oid) {
		// TODO Auto-generated method stub
		return "DTDC is ready to deliver products of"+oid;
	}

}
