package services;

import java.util.ArrayList;
import java.util.List;

import data.DataStorage;
import domainClasses.Author;
import domainClasses.Book;
import domainClasses.BookCopy;
import domainClasses.CheckOutEntry;

public class BookServiceImp implements BookService {

	DataService dataservice = ServiceFactory.getDataService();

	@Override
	public boolean isBookAvailable(String isbn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAvailability(String isbn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addBookCopy(String isbn) {
		// TODO Auto-generated method stub
		List<Book> books1 = new ArrayList<>();
		books1 = DataStorage.books;
		for (Book book : books1) {

			if (book.getIsbnNumber().equals(isbn)) {
				BookCopy bookCopy = new BookCopy(book, "" + (book.getCopies().size() + 1), true);
				book.getCopies().add(bookCopy);
				System.out.println("BookCopy" + bookCopy.getCopyNumber() + " added to storage");
				return;
			}
		}
		System.out.println("No book found in storage for the given isbn");

	}

	@Override
	public CheckOutEntry checkOutBookCopy(String memberId, String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookCopy createBookCopy(String isbn, String copyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book createBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book addBookToCollection(String isbn, String title, List<Author> authors, int numberCopies) {
		Book book = new Book(title, isbn, authors);
		for (int i = 0; i < numberCopies; i++) {
			book.getCopies().add(new BookCopy(book, "copyNumber" + i, true));
		}

		DataStorage.books.add(book);
		
		System.out.println("Successful! Book added");
		return book;
	}

}
