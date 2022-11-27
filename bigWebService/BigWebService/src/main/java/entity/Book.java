package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "Isbn")
	private String isbn;
	@Column(name = "BookName")
	private String bookName;
	@Column(name = "Author")
	private String author;
	@Column(name = "Publisher")
	private String publisher;
	@Column(name = "YearPubish")
	private Integer yearPubish;
	@Column(name = "Pages")
	private Integer pages;
	@Column(name = "Price")
	private Double price;

	public Book(String isbn, String bookName, String author, String publisher, Integer yearPubish, Integer pages,
			Double price) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.yearPubish = yearPubish;
		this.pages = pages;
		this.price = price;
	}

	public Book() {
		super();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getYearPubish() {
		return yearPubish;
	}

	public void setYearPubish(Integer yearPubish) {
		this.yearPubish = yearPubish;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
