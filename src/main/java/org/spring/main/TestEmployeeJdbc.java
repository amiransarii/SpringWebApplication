package org.spring.main;

import java.util.List;

import org.spring.dao.EmployeeJdbcDao;
import org.spring.entity.EmployeeJdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployeeJdbc {
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeJdbcDao dao = (EmployeeJdbcDao)context.getBean("edao");
		
		
		//insert a record
		/* int insertStatus = dao.saveEmployee(new EmployeeJdbc(104,"Ayub Khan",88388));
		String msg = insertStatus == 1? " Succesfully Inserted ": "Failed";
		System.out.println(msg);
		
		//update record
		int updateStatus = dao.updateEmployee(new EmployeeJdbc(103, "Zeeshan Muradbadi", 99999));
		String msg2 = updateStatus == 1? " Succesfully Updated ": "Failed";
		System.out.println(msg2);
		
		//deleted record
		int deletedStatus = dao.deleteEmployee(102);
		String msg3 =  deletedStatus == 1? " Succesfully deleted ": "Failed";
		System.out.println(msg3); 
		
		 //using prepared statment	
		Boolean result = dao.saveEmployeeByPreparedStatement(new EmployeeJdbc(107, "Rocky", 999999));
		System.out.println(result.booleanValue());*/
		
		//fetch the record
		List<EmployeeJdbc> empList = dao.getAllEmployees();
		empList.forEach(emp ->{
			System.out.println(emp.getId() +" "+emp.getName() +" "+emp.getSalary());
		});
		
		System.out.println();
		System.out.println("Fetch Records Using RowMapper");
		List<EmployeeJdbc> empList2 = dao.getAllEmployeesRowMapper();
		empList2.forEach(emp ->{
			System.out.println(emp.getId() +" "+emp.getName() +" "+emp.getSalary());
		});
		
		 //saved record using named paramter
		 
		//dao.saveUsingNamedJdbc(new EmployeeJdbc(108, "Ram Kumar", 6363663));
		
	}
	
	
         
	

}
