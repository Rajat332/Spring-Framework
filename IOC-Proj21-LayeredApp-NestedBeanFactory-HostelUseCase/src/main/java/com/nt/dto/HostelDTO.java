package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class HostelDTO implements Serializable {
	private int srno;
	private int hno;
	private String hname;
	private String haddr;
	private float hrent;
	
}
