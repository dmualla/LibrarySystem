package domainClasses;

public class BookCopy {

	private Book book;
	private String copyNumber;
	private boolean isAvailable;

	public BookCopy(Book book, String copyNumber, boolean isAvailable) {
		super();
		this.book = book;
		this.copyNumber = copyNumber;
		this.isAvailable = isAvailable;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getCopyNumber() {
		return copyNumber;
	}

	public void setCopyNumber(String copyNumber) {
		this.copyNumber = copyNumber;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
