package test;

import org.springframework.beans.factory.FactoryBean;

import com.nt.controller.StudentController;

public class ClintApp {
	

	

	private static Object BeanFactoryfactory;

	public static void main(String[]args) {
BeanFactoryfactory=newXmlBeanFactory(newFileSystemResource("sec/com/nt/cfgs/applicationContext.xml"));
		StudentController controller=FactoryBean.getBean("stController",StudentController.class);
		System.out.println(controller.process("1013", "raja", "56", "67", "78"));
		
	}

	private static Object newXmlBeanFactory(Object newFileSystemResource) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object newFileSystemResource(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
