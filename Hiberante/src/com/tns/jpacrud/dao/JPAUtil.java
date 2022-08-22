package com.tns.jpacrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager entitymanger;
	static
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager()
	{
	if(entitymanger==null || !entitymanger.isOpen()) {
		entitymanger = factory.createEntityManager();
	}
	return entitymanger;
	}
	}


