package com.nt.controller;

import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;

public class MainController {
	private EmployeeMgmtService service;

	public MainController(EmployeeMgmtService service) {
		this.service = service;
	}
	public    List<EmployeeDTO>  fetchEmployeesByDesgs(String[] desg)throws Exception{
		List<EmployeeDTO> listDTO=null;
		//use Service
		listDTO=service.findEmployeesByDesg(desg);
		return listDTO;
	}


}
