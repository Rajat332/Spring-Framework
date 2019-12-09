package com.nt.beans;

import java.util.Calendar;

public class Tournament {
private String name;
private Event event;
private Calendar cal;
public void setName(String name) {
	System.out.println("Tournament.setName(-)");
	this.name = name;
}
public void setEvent(Event event) {
	System.out.println("Tournament.setEvent(-)");
	this.event = event;
}
public void setCal(Calendar cal) {
	System.out.println("Tournament.setCal(-)");
	this.cal = cal;
}
public Tournament() {
	System.out.println("Tournament::0-param constructor");
}
public Tournament(Event event) {
	System.out.println("Tournament::1-param constructor");
}
public Tournament( Event event, Calendar cal) {
	
	this.event = event;
	this.cal = cal;
}
@Override
public String toString() {
	return "Tournament [name=" + name + ", event=" + event + ", cal=" + cal + "]";
}

}






