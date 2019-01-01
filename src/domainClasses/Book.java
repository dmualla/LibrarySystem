package domainClasses;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String title;
	private String isbnNumber;
	private List<BookCopy> copies;
	private List<Author> authors;
	private int maxBorrowDays;

	public Book(String title, String isbnNumber, List<BookCopy> copies, List<Author> authors, int maxBorrowDays) {
		super();
		this.title = title;
		this.isbnNumber = isbnNumber;
		this.copies = copies;
		this.authors = authors;
		this.setMaxBorrowDays(maxBorrowDays);
	}

	public Book(String title, String isbnNumber, List<Author> authors) {
		super();
		this.title = title;
		this.isbnNumber = isbnNumber;
		this.copies = new ArrayList<BookCopy>();
		this.authors = authors;
		this.setMaxBorrowDays(21);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public List<BookCopy> getCopies() {
		return copies;
	}

	public void setCopies(List<BookCopy> copies) {
		this.copies = copies;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public int getMaxBorrowDays() {
		return maxBorrowDays;
	}

	public void setMaxBorrowDays(int maxBorrowDays) {
		this.maxBorrowDays = maxBorrowDays;
	}

}
