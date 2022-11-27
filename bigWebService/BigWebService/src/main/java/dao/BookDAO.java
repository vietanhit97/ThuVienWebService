package dao;

import java.util.List;

import entity.Book;

public interface BookDAO {
	public List<Book> getListBooks();

	public Book getBookById(String isbn);

	public boolean insertBook(Book book);

	public boolean updateBook(Book book);

	public boolean deleteBook(String isbn);
}
