package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student1 = new Student();
		student1.setStudentname("swamy");
		
		Address homeAddress1 = new Address();
		
		homeAddress1.setStreet("RSC 132");
		homeAddress1.setCity("Mumbai");
		homeAddress1.setState("Maharashtra");
		homeAddress1.setZipcode("400064");
		
		//inject address into student
		student1.setAddress(homeAddress1);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student1);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		/*
		 * em.close(); factory.close();
		 */
	}
}
