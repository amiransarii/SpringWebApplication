package org.spring.entity;

/**
 * 
 * @author amir.ansari
 *this is a class which entity will insert mysql data base
 */
public class EmployeeJdbc {
	
	private int id;
	private String name;
	private float salary;
	
	
	public EmployeeJdbc(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public EmployeeJdbc() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	

}
