package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public final class EmployeeDAOImpl implements EmployeeDAO {
private DataSource ds;

public EmployeeDAOImpl(DataSource ds) {
	this.ds = ds;
}

@Override
public List<EmployeeBO> getEmployeeByDesgs(String cond) throws Exception {
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
List<EmployeeBO>listBO=null;
EmployeeBO bo=null;
try {
	//get Pooled JDBC Connection
	con=ds.getConnection();
	//create PreparedStatement object
	ps=con.prepareStatement("SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM  EMP WHERE JOB IN \"+ cond+\" ORDER BY JOB");
//execute SQL Query
	rs=ps.executeQuery();
	//copy ReusltSet obj records to List Collection as BO Class object
	listBO=new ArrayList();
	while(rs.next()) {
		//copy each record to BO class object
		bo=new EmployeeBO();
		bo.setEno(rs.getInt(1));
	    bo.setEname(rs.getString(2));
		bo.setDesg(rs.getString(3));
		bo.setSalary(rs.getInt(4));
		bo.setDeptNo(rs.getInt(5));
		//add Each BO class obj to ListBO
		listBO.add(bo);
	}
}
catch(SQLException se) {
	se.printStackTrace();
	throw se;
}
catch(Exception e) {
	e.printStackTrace();
	throw e;
}
finally {
	//close jdbc objs
	try {
		if(rs!=null)
			rs.close();
	}
	catch(SQLException se) {
		se.printStackTrace();
	}
	try {
		if(ps!=null)
			ps.close();
	}
	catch(SQLException se) {
		se.printStackTrace();
	}
	try {
		if(con!=null)
			con.close();
	}
	catch(SQLException se) {
		se.printStackTrace();
	}
}
return listBO;
}
}

