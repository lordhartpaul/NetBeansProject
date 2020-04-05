package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.BooksDao;
import com.hcl.entity.Books;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	BooksDao booksDao;

	@Transactional
	public String addBooks(Books books) {

		return booksDao.addBooks(books);

	}

	@Transactional
	public String getBookById(int bookId) {

		return booksDao.getBookById(bookId);
	}

	@Transactional
	public List<Books> getAllBooks() {

		return booksDao.getAllBooks();
	}

	@Transactional
	public String updateBooks(Books books) {

		return booksDao.updateBooks(books);
	}

	@Transactional
	public String deleteBookById(int bookId) {

		return booksDao.deleteBookById(bookId);
	}

}
