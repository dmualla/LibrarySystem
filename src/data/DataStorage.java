package data;

import java.util.ArrayList;
import java.util.List;

import domainClasses.Author;
import domainClasses.AuthorizationLevel;
import domainClasses.Book;
import domainClasses.BookCopy;
import domainClasses.Member;
import domainClasses.User;

public class DataStorage {

	public static List<Book> books = new ArrayList<>();
	public static List<BookCopy> bookCopies = new ArrayList<>();
	public static List<Author> authors = new ArrayList<>();
	public static List<User> users = new ArrayList<>();
	public static List<Member> members = new ArrayList<>();

	public static void initialize() {

		String credentials = "Book Writer";
		String biography = "Book Writer";

		String id;
		String firstName = "Fname";
		String lastName = "Lname";
		String phoneNumber = null;
		String street = null;
		String city = null;
		String state = null;
		String zipCode = null;

		for (int i = 0; i < 5; i++) {
			Author author1 = new Author("Author" + i, firstName + i, lastName + i, null, null, null, null, null,
					credentials, biography, new ArrayList<>());
			authors.add(author1);
			Book book = new Book("title" + i, "isbn" + i, authors);
			books.add(book);
		}
		for (int i = 0; i < books.size(); i++) {

			List<BookCopy> bookCopies1 = new ArrayList<>();
			for (int j = 1; j < 4; j++) {
				BookCopy bookCopy = new BookCopy(books.get(i), "158" + i + j, true);
				bookCopies.add(bookCopy);
				bookCopies1.add(bookCopy);

			}
			books.get(i).setCopies(bookCopies1);

		}

		for (int i = 6; i < 10; i++) {
			AuthorizationLevel level;
			if (i == 6)
				level = AuthorizationLevel.ADMIN;
			else if (i == 7)
				level = AuthorizationLevel.LIBRARIAN;
			else
				level = AuthorizationLevel.BOTH;

			users.add(new User("user" + i, firstName + i, lastName + i, phoneNumber, street, city, state, zipCode,
					"user" + i, "password" + i, level));
		}

		for (int i = 1; i < 6; i++) {
			members.add(
					new Member("member" + i, firstName + i, lastName + i, phoneNumber, street, city, state, zipCode));
		}

	}

}
