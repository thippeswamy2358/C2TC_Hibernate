package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Department department = new Department();
		department.setId(1);
		department.setName("C2TC");

		Department department1 = new Department();
		department.setId(2);
		department.setName("C2C");

		Employee employee4 = new Employee();
		employee4.setEid(1);
		employee4.setEname("swamy");
		employee4.setEsalary(28000);

		Employee employee1 = new Employee();
		employee1.setEid(1);
		employee1.setEname("shivanand");
		employee1.setEsalary(28000);

		Employee employee2 = new Employee();
		employee2.setEid(1);
		employee2.setEname("rohith");
		employee2.setEsalary(28000);

		Employee employee3 = new Employee();
		employee3.setEid(1);
		employee3.setEname("triveni");
		employee3.setEsalary(28000);

		department.addEmployee1(employee1);
		department1.addEmployee1(employee2);
		department1.addEmployee1(employee3);
		department.addEmployee1(employee4);

		em.persist(department);
		em.persist(department1);

		System.out.println("Added department along with two employees to database.");

		em.getTransaction().commit();

	}

}
