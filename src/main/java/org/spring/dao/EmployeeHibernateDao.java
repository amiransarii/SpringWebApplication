package org.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.spring.entity.EmployeeHibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

//It is a java class that uses the HibernateTemplate class method to persist the object of Employee class.
@Transactional
public class EmployeeHibernateDao {
	
	private HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  

	
	public int saveEmployee(EmployeeHibernate e){  
	     
		try {
			template.save(e);
			return 1;
		}
		catch(Exception ex) {
			ex.printStackTrace();;
			return -1;
		}
	}  
	//method to update employee  
	public int updateEmployee(EmployeeHibernate e){  
		try {
			template.update(e);  
			return 1;
		}
		catch(Exception ex) {
			return -1;
		}	
	}  
	//method to delete employee  
	public int deleteEmployee(EmployeeHibernate e){  
	    
		try {
			template.delete(e);  
			return 1;
		}
		catch(Exception ex) {
			return -1;
		}	
	}  
	//method to return one employee of given id  
	public EmployeeHibernate getById(int id){  
		EmployeeHibernate e=(EmployeeHibernate)template.get(EmployeeHibernate.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<EmployeeHibernate> getEmployees(){  
	    List<EmployeeHibernate> list=new ArrayList<EmployeeHibernate>();  
	    list=template.loadAll(EmployeeHibernate.class);  
	    return list;  
	}  

}
