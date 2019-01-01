package services;

import java.util.List;

import domainClasses.Author;
import domainClasses.Book;
import domainClasses.BookCopy;
import domainClasses.CheckOutEntry;

public interface BookService {

	public boolean isBookAvailable(String isbn);

	public boolean updateAvailability(String isbn);
	
	public void addBookCopy(String isbn);

	public CheckOutEntry checkOutBookCopy(String memberId, String isbn);

	public BookCopy createBookCopy(String isbn, String copyNumber);

	public Book createBook();
	
	public Book addBookToCollection(String isbn, String title, List<Author> authors, int numberCopies);

}
