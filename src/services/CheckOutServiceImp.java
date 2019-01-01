package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import data.DataStorage;
import domainClasses.Book;
import domainClasses.BookCopy;
import domainClasses.CheckOutEntry;
import domainClasses.CheckOutRecord;
import domainClasses.FineRecord;
import domainClasses.Member;

public class CheckOutServiceImp implements CheckOutService {

	@Override
	public CheckOutRecord createCheckoutRecord(List<CheckOutEntry> entries, Member member) {

		CheckOutRecord checkOutRecord = new CheckOutRecord(entries, member);
		return checkOutRecord;

	}

	@Override
	public CheckOutEntry createCheckOutEntry(LocalDate checkOutDate, LocalDate dueDate,
			BookCopy bookCopy) {
	

		CheckOutEntry checkOutEntry = new CheckOutEntry(checkOutDate, dueDate, bookCopy);

		return checkOutEntry;
	}

	@Override
	public void checkOutBookCopy(String memberId, String bookIsbn, LocalDate date) {
	
		List<CheckOutEntry> entries = new ArrayList<>();
		LocalDate dueDate = LocalDate.now().plusDays(21);
		List<Book> books1 = DataStorage.books;
		boolean bookCheck = false;
		boolean bookCopyAvailability = false;
		BookCopy bookCopyInstance = null ;
		for(Book book : books1) {
			if(book.getIsbnNumber().equals(bookIsbn))
			{
				bookCheck=true;
				for(BookCopy bookCopy : book.getCopies()) {
					if(bookCopy.isAvailable()) {
						bookCopyAvailability = true;
						bookCopyInstance = bookCopy;
						break;
					}
				}
				
			}
		}
		List<Member> members1 = DataStorage.members;
		for(Member member : members1) {
			if(member.getId().equals(memberId))
			{
				bookCopyInstance.setAvailable(false);
				List<CheckOutEntry> entries1 = new ArrayList<>();
				entries.add(new CheckOutEntry(date, dueDate, bookCopyInstance));
				CheckOutRecord record = new CheckOutRecord(entries1, member);
				System.out.println("Member with ID : " +member.getId()+" has successfully checked out book copy number : "+bookCopyInstance.getCopyNumber());
				
				return;
			}
		}
		
		
	}

}
