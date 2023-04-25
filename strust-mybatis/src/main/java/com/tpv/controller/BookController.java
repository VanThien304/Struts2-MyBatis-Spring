package com.tpv.controller;

import java.util.List;

import com.tpv.model.BookDao;
import com.tpv.model.BookImpl;
import com.tpv.entity.Book;

public class BookController {
	BookDao bookDao = new BookImpl();
	
	public List<Book> getListBook(){
		return bookDao.getList();
	}
	
	public Book getDetailsByCode(String bookId) {
		return bookDao.getDetails(bookId);
	}
	
	public boolean addBook(Book objBook) {
		return bookDao.add(objBook);
	}
	
	public boolean update(Book objBook) {
		return bookDao.update(objBook);
	}
	
	public boolean delete(String bookId) {
		return bookDao.delete(bookId);
	}
}
