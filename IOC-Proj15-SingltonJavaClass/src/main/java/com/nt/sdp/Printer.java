package com.nt.sdp;

public class Printer {
	private static Printer INSTANCE;

	public Printer() {
		System.out.println("Printer:0-param constructor");
		}

	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		
		
		return INSTANCE;
	}

	public void print(String msg) {
	System.out.println(msg);	
	}
	}


