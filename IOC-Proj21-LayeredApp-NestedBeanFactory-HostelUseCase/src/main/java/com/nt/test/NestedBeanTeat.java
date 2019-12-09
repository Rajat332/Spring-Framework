package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import com.nt.controller.MainController;
import com.nt.vo.HostelVO;

public class NestedBeanTeat {

	public static void main(String[] args) 
	{
		
		
BeanFactory pFactory=new XmlBeanFactory(new FileSysyemResource("src/main/java/com/nt/cfgs/business-beans.xml"));
		
		BeanFactory cFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/presentation-beans.xml"),pFactory1);
		
		MainController controller=cFactory.getBean("controller",MainController.class);
		
		List<HostelVO> listVO=null;
		
		try
		{
			listVO=controller.showHostelByCity("pune", "hyderabad");
			System.out.println("Hostel Details In Cities Are:");
			for(HostelVO vo:listVO)
			{
				System.out.println(vo);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
