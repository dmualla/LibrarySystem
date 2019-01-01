package services;

import java.time.LocalDate;
import java.util.List;

import domainClasses.BookCopy;
import domainClasses.CheckOutEntry;
import domainClasses.CheckOutRecord;
import domainClasses.FineRecord;
import domainClasses.Member;

public interface CheckOutService {

	public CheckOutRecord createCheckoutRecord(List<CheckOutEntry> entries, Member member);

	public CheckOutEntry createCheckOutEntry(LocalDate checkOutDate, LocalDate dueDate,
			BookCopy bookCopy);

	public void checkOutBookCopy(String memberId, String bookIsbn, LocalDate date);

}
