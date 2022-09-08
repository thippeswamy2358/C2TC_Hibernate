package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client 
{
	public static void main(String[] args)
	{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	
	Department department=new Department();
	department.setId(2);
	department.setName("C2TC");
	
	Department department1=new Department();
	department1.setId(12);
	department1.setName("C2C");
	
	Employee employee1=new Employee();
	employee1.setEid(1000);
	employee1.setEname("swamy");
	employee1.setEsalary(50000);
	
	Employee employee2=new Employee();
	employee2.setEid(1022);
	employee2.setEname("rohith");
	employee2.setEsalary(500000);
	
	Employee employee3=new Employee();
	employee3.setEid(103);
	employee3.setEname("Madhu");
	employee3.setEsalary(5000);
	
	
	Employee employee4=new Employee();
	employee4.setEid(104);
	employee4.setEname("kiran");
	employee4.setEsalary(10000);
	
	department.addEmployee(employee1);
	department.addEmployee(employee2);
	department1.addEmployee(employee3);
	department1.addEmployee(employee4);
	
	em.persist(department);
	em.persist(department1);
	em.getTransaction().commit();
	System.out.println("Added department along with two employees to database.");
	

}
}