package com.nt.dao;

import java.util.List;

import com.nt.bo.HostelBO;

public interface HostelDAO {
	public List<HostelBO> getHostelByCity(String city1,String city2)throws Exception;
	

}
