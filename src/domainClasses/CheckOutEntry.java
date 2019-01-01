package domainClasses;

import java.time.LocalDate;

public class CheckOutEntry {

	private LocalDate checkOutDate;
	private LocalDate dueDate;
	private BookCopy bookCopy;
	private FineRecord fineRecord;

	public CheckOutEntry(LocalDate checkOutDate, LocalDate dueDate , BookCopy bookCopy) {
		super();
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
		this.bookCopy = bookCopy;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public BookCopy getBookCopy() {
		return bookCopy;
	}

	public void setBookCopy(BookCopy bookCopy) {
		this.bookCopy = bookCopy;
	}

	public FineRecord getFineRecord() {
		return fineRecord;
	}

	public void setFineRecord(FineRecord fineRecord) {
		this.fineRecord = fineRecord;
	}

}
