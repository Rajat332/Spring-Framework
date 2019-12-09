package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import com.nt.dto.HostelDTO;
import com.nt.service.HostelService;
import com.nt.vo.HostelVO;

public class MainController 
{
	private HostelService service;
	
	public MainController(HostelService service) 
	{
		this.service = service;
	}
	
	public List<HostelVO> showHostelByCity(String city1,String city2)throws Exception
	{
		List<HostelDTO> listDTO=null;
		List<HostelVO> listVO=null;
		listDTO=service.fetchHostelByCity(city1, city2);
		listVO=new ArrayList();
		HostelVO vo=null;
		
		for(HostelDTO dto:listDTO)
		{
			vo=new HostelVO();
			vo.setHno(String.valueOf(dto.getHno()));
			vo.setHname(dto.getHname());
			vo.setHaddr(dto.getHaddr());
			vo.setHrent(String.valueOf(dto.getHrent()));
			vo.setSrno(String.valueOf(dto.getSrno()));
			listVO.add(vo);
		}
		
		return listVO;
	}



}
