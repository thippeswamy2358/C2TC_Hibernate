package com.cg.jpacrud.service;

import com.cg.jpacrud.dao.BookDao;
import com.cg.jpacrud.dao.BookDaoImpl;
import com.cg.jpacrud.entities.Book;

public class BookServiceImpl  implements BookService  {

	private BookDao dao;

	public BookServiceImpl() {
		dao = new BookDaoImpl();
	}
	@Override
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
