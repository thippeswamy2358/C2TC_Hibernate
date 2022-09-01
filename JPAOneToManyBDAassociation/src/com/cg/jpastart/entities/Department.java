package com.cg.jpastart.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="department")
public class Department implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	@OneToMany( mappedBy ="department",cascade=CascadeType.ALL)
	private	Set<Employee> employees= new HashSet<>();
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
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
	public void addEmployee1(Employee employee1) {
		((Employee) employees).setDepartment(this);
		this.getEmployees().add((Employee) employees);
	}
	
}
