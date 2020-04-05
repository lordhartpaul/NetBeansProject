package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Books;
import com.hcl.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	BooksService booksService;

	@RequestMapping(value = "/getBook/{bookId}", method = RequestMethod.GET)
	public String getBookById(int bookId) {
		return booksService.getBookById(bookId);
	}

	@RequestMapping(value = "/getAllBooks", method = RequestMethod.GET)
	public List<Books> getMessage() {
		return booksService.getAllBooks();
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateBook(Books books) {
		return booksService.updateBooks(books);
	}

	@RequestMapping(value = "/addBooks", method = RequestMethod.POST)
	public String addBooks(Books books) {
		return booksService.addBooks(books);
	}

	@RequestMapping(value = "/delete/{bookId}", method = RequestMethod.DELETE)
	public String deleteBookById(int bookId) {
		return booksService.deleteBookById(bookId);
	}
}
