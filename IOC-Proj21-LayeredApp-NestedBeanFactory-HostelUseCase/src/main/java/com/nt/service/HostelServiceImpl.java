package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.HostelBO;
import com.nt.dao.HostelDAO;
import com.nt.dto.HostelDTO;

public class HostelServiceImpl implements HostelService {

private HostelDAO dao=null;
	
	public HostelServiceImpl(HostelDAO dao)
	{
		this.dao = dao;
	}
	


	public List<HostelDTO> fetchHostelByCity(String city1,String city2)throws Exception
	{
		List<HostelBO> listBO=null;
		List<HostelDTO> listDTO=null;
		HostelDTO dto=null;
		
		listBO=dao.getHostelByCity(city1, city2);
		
		listDTO=new ArrayList();
		
		for(HostelBO bo:listBO)
		{
			dto=new HostelDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSrno(listDTO.size()+1);
			listDTO.add(dto);
			
		
		}
		return listDTO;

	

	
	}
	

}
