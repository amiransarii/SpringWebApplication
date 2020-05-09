package org.spring.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.spring.entity.EmployeeJdbc;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;  
public class EmployeeJdbcDao {
	
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	 //for named parameter
	/*public EmployeeJdbcDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {  
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;  
}  */
	
	//insert record
	public int saveEmployee(EmployeeJdbc emp) {
		String query = "insert into emp_jdbc_table values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"')";  
		return jdbcTemplate.update(query);
		
	}
	
	//update record
	public int updateEmployee(EmployeeJdbc emp) {
		
		String query = "update emp_jdbc_table set name='"+emp.getName()+"',salary='"+emp.getSalary()+"' where id='"+emp.getId()+"' ";  	
		return jdbcTemplate.update(query);
		
		
	}
	
	//delete record
	public int deleteEmployee(int id) {
		
		String query="delete from emp_jdbc_table where id='"+id+"' ";  
		return jdbcTemplate.update(query);
			
	}
	
	 //using prepared statement
	 
		public Boolean saveEmployeeByPreparedStatement(final EmployeeJdbc e){  
			String query="insert into emp_jdbc_table values(?,?,?)";  
		    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		              
		        ps.setInt(1,e.getId());  
		        ps.setString(2,e.getName());  
		        ps.setFloat(3,e.getSalary());  
		              
		        return ps.execute();  
		              
		    }  
		    });  
		}
		
		//fetch the record using ResultSetExtractor
		 public List<EmployeeJdbc> getAllEmployees(){
			 
			 return jdbcTemplate.query("select * from emp_jdbc_table",new ResultSetExtractor<List<EmployeeJdbc>>(){  
				    @Override  
				     public List<EmployeeJdbc> extractData(ResultSet rs) throws SQLException,  
				            DataAccessException {  
				      
				        List<EmployeeJdbc> list=new ArrayList<EmployeeJdbc>();  
				        while(rs.next()){  
				        EmployeeJdbc e=new EmployeeJdbc();  
				        e.setId(rs.getInt(1));  
				        e.setName(rs.getString(2));  
				        e.setSalary(rs.getInt(3));  
				        list.add(e);  
				        }  
				        return list;  
				        }  
				    });  
			 
		 }
		
		//fetch the record using RowMapper
		 public List<EmployeeJdbc>getAllEmployeesRowMapper(){  
			 
			 return jdbcTemplate.query("select * from emp_jdbc_table",new RowMapper<EmployeeJdbc>(){  
				    @Override  
				    public EmployeeJdbc mapRow(ResultSet rs, int rownumber) throws SQLException {  
				    	EmployeeJdbc e=new EmployeeJdbc();  
				        e.setId(rs.getInt(1));  
				        e.setName(rs.getString(2));  
				        e.setSalary(rs.getInt(3));  
				        return e;  
				    }  
				    });  
			 
			 
		 }
	
		 
		 //insert record using named parameter
		 public  void saveUsingNamedJdbc (EmployeeJdbc e){  
			 String query="insert into emp_jdbc_table values (:id,:name,:salary)";  
			   
			 Map<String,Object> map=new HashMap<String,Object>();  
			 map.put("id",e.getId());  
			 map.put("name",e.getName());  
			 map.put("salary",e.getSalary());  
			   
			 namedParameterJdbcTemplate.execute(query,map,new PreparedStatementCallback() {  
			     @Override  
			     public Object doInPreparedStatement(PreparedStatement ps)  
			             throws SQLException, DataAccessException {  
			         return ps.executeUpdate();  
			     }  
			 });  
			 }  
			 

}
