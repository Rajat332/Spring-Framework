package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentSrviceImpl implements StudentService {

	private StudentDAO dao;
	
	
	public StudentSrviceImpl(StudentDAO dao) {
		
		System.out.println("StudentSrviceImpl:1-param constructor");
		this.dao=dao;
	}


	@Override
	public String registerStudent(StudentDTO dto) throws Exception {
	int total=0;
	float avg=0.0f;
	String result=null;
	StudentBO bo=null;
	int count=0;
	 //write b.logic
	total=dto.getM1()+dto.getM2()+dto.getM3();
	avg=total/3.0f;
	if(dto.getM1()<35 || dto.getM2()<35 || dto.getM3()<35)
		result="fail";
	else
		result="pass";
	//prepare BO class object  having persistable data..
	bo=new StudentBO();
	bo.setSname(dto.getSname());
	bo.setSadd(dto.getSadd());
	bo.setTotal(total);
	bo.setAvg(avg);
	bo.setResult(result);
	//use DAO
	count=dao.insert(bo);
	//process result
	if(count==0)
		return "Student Registration Failed -->result::"+result;
	else
		return "Student Registration Succeded -->result::"+result;
}//method
}//class

	


