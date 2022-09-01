package com.cg.jpacrud.dao;

import javax.persistence.EntityManager;

import com.cg.jpacrud.entities.Book;

public class BookDaoImpl implements BookDao {
	private EntityManager entityManager;

	public BookDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
