package com.nt.beans;

import java.util.Date;

public class PersonProfile {
private int pid;
	private String name;
	private float age;
	private Date dob;
	private Date doj;
	private Date dom;

	public PersonProfile(int pid, String name, float age, Date dob, Date doj, Date dom) {
		System.out.println("PersonProfile:6-param constructor");
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "PersonProfile [pid=" + pid + ", name=" + name + ", age=" + age + ", dob=" + dob + ", doj=" + doj
				+ ", dom=" + dom + "]";
	}
	
}
