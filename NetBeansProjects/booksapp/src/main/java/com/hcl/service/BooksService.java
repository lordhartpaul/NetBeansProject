package com.hcl.service;

import java.util.List;

import com.hcl.entity.Books;

public interface BooksService {

	public String addBooks(Books books);

	public String getBookById(int bookId);

	public List<Books> getAllBooks();

	public String updateBooks(Books books);

	public String deleteBookById(int bookId);
}
