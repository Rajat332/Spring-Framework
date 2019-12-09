package com.nt.service;

import java.util.List;

import com.nt.dto.HostelDTO;

public interface HostelService {
	public List<HostelDTO> fetchHostelByCity(String city1,String city2)throws Exception;

}
