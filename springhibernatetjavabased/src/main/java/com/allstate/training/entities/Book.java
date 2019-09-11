package com.allstate.training.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Book {
	@Id
	private String bookId;
	private String bookName;
	private String Author;
	@ManyToOne(cascade=CascadeType.ALL)
	private Library library=new Library();
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", Author=" + Author + ", library=" + library
				+ "]";
	}
	
	


}
