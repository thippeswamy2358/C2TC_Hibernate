package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Manager manager1=new Manager();
		manager1.setName("swamy");
		manager1.setSalary(100000);
		manager1.setDepartmentName("C2TC");
		em.persist(manager1);
		em.getTransaction().commit();
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();

}}
