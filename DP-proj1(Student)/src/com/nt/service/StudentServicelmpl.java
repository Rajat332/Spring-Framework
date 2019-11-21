package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServicelmpl implements StudentService {
	
private StudentDAO dao;

private StudentServicelmpl(StudentDAO dao) {
	this.dao=dao;
}
public String generateResult(StudentDTO dto) {
	int total=dto.getM1()+dto.getM3();
	float avg=(float)total/3.0f;
	String result=null;
	if(avg<35)
		result="Fail";
	else
		result="pass";
	StudentBO bo=newStudentBO();
	bo.setSno(dto.getSno());
	bo.setSname(dto.getSname());
	bo.settotal(total);
	bo.setAvg(avg);
	bo.setResult(result);
	int cnt=dao.insert(bo);
	if(cnt==0)
		return"Result:+bo.getResult()+\"  "+bo.getSno()+"Registration Failed";
		else
			return "Result:+bo.getResult()+\"  \"+bo.getSno()+\"Registration Succedded";
}
private StudentBO newStudentBO() {
	// TODO Auto-generated method stub
	return null;
}
}


