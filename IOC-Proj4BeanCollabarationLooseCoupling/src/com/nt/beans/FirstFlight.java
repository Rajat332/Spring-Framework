package com.nt.beans;

public class FirstFlight implements Courier {
		
		public FirstFlight() {
			System.out.println("FirstFlight:: 0-param constructor");
		}
		
		public   String  deliver(int oid) {
			return "FirstFlight is delivering  "+oid+" order id products";
		}

	}


