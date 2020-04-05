package com.hcl.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Books;

@Repository
public class BooksDaoImpl implements BooksDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public String addBooks(Books books) {
		getSession().save(books);
		return "Book " + books.getBookName() + " added successfully!!!!!";
	}

	public String getBookById(int bookId) {
		Books book = (Books) getSession().get(Books.class, bookId);

		return "Book " + book.getBookName() + " Book ID is " + book.getBookId();
	}

	@SuppressWarnings("unchecked")
	public List<Books> getAllBooks() {

		List<Books> booksList1 = getSession().createCriteria(Books.class).list();
		System.out.println("Books list " + booksList1);
		return booksList1;
	}

	public String updateBooks(Books books) {

		getSession().update(books);
		return "Book " + books.getBookName() + "updated Successfully!!!!!";

	}

	public String deleteBookById(int bookId) {

		Books book = (Books) getSession().load(Books.class, bookId);
		if (book.getBookId() == bookId) {

			getSession().delete(book);
			return "Book " + book.getBookName() + " deleted Successfully!!!";
		}
		return "Book is not found";
	}

}
