package org.spring.main;

import org.spring.dao.EmployeeHibernateDao;
import org.spring.entity.EmployeeHibernate;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestEmployeeHibernate {
	
	public static void main(String args[]) {
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		EmployeeHibernateDao dao = (EmployeeHibernateDao)factory.getBean("d");
		EmployeeHibernate emp = new EmployeeHibernate();
		 
		//insert the record
		emp.setId(101);
		emp.setName("AmirAnsari");
		emp.setSalary(393939);
		 
		int insertedRecord = dao.saveEmployee(emp);
		String inserteMsg = insertedRecord == 1 ? "Record Inserted Succefully":"Failed";
		System.out.println(insertedRecord);
		
		
	}

}
