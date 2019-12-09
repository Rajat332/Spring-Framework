package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.HostelBO;

public class HostelDAOImpl {
	private DataSource ds;
	private static final String getHostelDetails="select hno,hname,hadd,hrent from hostel_details where hadd in(?,?)order by hadd";
	
	public HostelDAOImpl(DataSource ds)
	{
	
		this.ds = ds;
	}

	public List<HostelBO> getHostelByCity(String city1, String city2) throws Exception 
	{
		Connection con=null;
		PreparedStatement ps=null;
		List<HostelBO> listBO=null;
		HostelBO bo=null;
		ResultSet rs=null;
		try
		{
			con=ds.getConnection();
			ps=con.prepareStatement(getHostelDetails);
			ps.setString(1,city1);
			ps.setString(2,city2);
			
			rs=ps.executeQuery();
			
			listBO=new ArrayList();
			
			while(rs.next())
			{
				bo=new HostelBO();
				bo.setHno(rs.getInt(1));
				bo.setHname(rs.getString(2));
				bo.setHaddr(rs.getString(3));
				bo.setHrent(rs.getFloat(4));
				listBO.add(bo);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
		finally
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
				}
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				throw e;
			}
			
			try
			{
				if(ps!=null)
				{
					ps.close();
				}
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				throw e;
			}
			
			try
			{
				if(con!=null)
				{
					con.close();
				}
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				throw e;
			}
		}
		
		return listBO;
	}

}
