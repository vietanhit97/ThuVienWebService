package service;

import java.util.List;

import dao.BookDAOImpl;
import entity.Book;

public class BookService {
	public Book[] getListBooks() {
		List<Book> listBooks = new BookDAOImpl().getListBooks();
		Book[] arr = new Book[listBooks.size()];
		listBooks.toArray(arr);
		return arr;
	}

	public Book getBookById(String isbn) {
		return new BookDAOImpl().getBookById(isbn);
	}

	public boolean insertBook(Book book) {
		return new BookDAOImpl().insertBook(book);
	}

	public boolean updateBook(Book book) {
		return new BookDAOImpl().updateBook(book);
	}

	public boolean deleteBook(String isbn) {
		return new BookDAOImpl().deleteBook(isbn);
	}
}
