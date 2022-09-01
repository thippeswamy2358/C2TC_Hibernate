package com.cg.jpastart.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Scanner sc=new Scanner(System.in);
		em.getTransaction().begin();
		
		//create one employee
		System.out.println("enter the name of the employee");
		String ename=sc.next();
		System.out.println("enter the salary of the employee");
		int esal=sc.nextInt();
		
		Employee employee1 = new Employee();
		employee1.setName(ename);
		employee1.setSalary(esal);
		em.persist(employee1);
		
		//create one manager
		System.out.println("enter the name of the manager");
		String name=sc.next();
		System.out.println("enter the salary of the manager");
		int sal=sc.nextInt();
		System.out.println("enter the departntment name of the manager");
		String deptname=sc.next();
		Manager manager1 = new Manager();
		manager1.setName(name);
		manager1.setSalary(sal);
		manager1.setDepartmentName(deptname);
		em.persist(manager1);
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
	}

}
