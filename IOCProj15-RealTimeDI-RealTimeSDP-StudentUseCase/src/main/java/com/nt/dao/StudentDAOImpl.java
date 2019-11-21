package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {

	private static final String STUDENT_INSERT_QUERY="INSERT INTO LAYERED_STUDENT(SNAME,SADD,TOTAL,AVG,RESULT) VALUES(?,?,?,?,?)"; 
	private DataSource ds;
	public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl:1-param constructor");
	this.ds=ds;
	}
	
	@Override
	public int insert(StudentBO bo) throws Exception {
		int count=0;
		Connection con=null;
		PreparedStatement ps=null;
		
		//get pooled jdbc con object
				con=ds.getConnection();
				//create PreparedStatement obj having SQL Query
				ps=con.prepareStatement(STUDENT_INSERT_QUERY);
				//set values to query params
				ps.setString(1,bo.getSname());
				ps.setString(2,bo.getSadd());
				ps.setInt(3,bo.getTotal());
				ps.setFloat(4,bo.getAvg());
				ps.setString(5,bo.getResult());
		      //execute the SQL Query
				count=ps.executeUpdate();
				
				//close jdbc objs
				ps.close();
				con.close();
				return count;
	}

}
