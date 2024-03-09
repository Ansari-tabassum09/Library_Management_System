package com.jsp.lms_controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jsp.lms_model.Book;
import com.jsp.lms_model.Library;
import com.jsp.lms_view.View;

public class Controller {
	
	private Library library = View.getLibrary();
	
	public void addBook(Book book) {
	
		List<Book> books = library.getBooks();
		if (books == null) {
			books = new ArrayList<>();
		}
		books.add(book);
		library.setBooks(books);
	}
	
	public boolean removeBook(String bookName) {
		Book book = getBook(bookName);
		if (book != null) {
			List<Book> books = library.getBooks();
	        boolean remove = books.remove(book);
	        library.setBooks(books);
	        return true; 
		}
		return false;
	}
	
	public boolean update(Book bookExist, Book bookToUpdate) {
		List<Book> books = library.getBooks();
		for (Book book : books) {
			if (book.getBookName().equalsIgnoreCase(bookExist.getBookName())) {
				books.remove(bookExist);
				books.add(bookToUpdate);
				library.setBooks(books);
				return true;
			}
		}
		return false;
	}
	
	public Book getBook(String bookName) {
		
		List<Book> books = library.getBooks();
		if (books != null) {
			for (Book book : books) {
				if (book.getBookName().equalsIgnoreCase(bookName)) {
					return book;
				}
			}
		}
		return null;
	}
	


}
