package mainClassPackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.DataStorage;
import domainClasses.Author;
import domainClasses.AuthorizationLevel;
import domainClasses.Book;
import domainClasses.BookCopy;
import services.LoginService;
import services.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		DataStorage.initialize();

		Scanner scanner = new Scanner(System.in);
		String loginResult = null;
		do {
			boolean isSession = false;
			System.out.print("Write for UserName: ");
			String userName = scanner.nextLine();
			System.out.print("Write for Password: ");
			String password = scanner.nextLine();

			LoginService loginService = ServiceFactory.getLoginService();
			loginResult = loginService.login(userName, password);
			if ((loginResult == null || loginResult == "")) {
				System.out.println("login failed, please try again");
			} else {
				switch (loginResult) {
				case "ADMIN":
					isSession = true;
					do {
						System.out.println("Welcome ADMIN User !!");
						System.out.println("1. Add a new book");
						System.out.println("2. Add a member");
						System.out.println("3. Add a book copy");
						System.out.println("4. Log Out");
						System.out.print("Please select an option: ");
						String choice = scanner.nextLine();

						switch (choice) {

						case "1":
							System.out.println("Please enter the ISBN: ");
							String isbn = scanner.nextLine();
							System.out.println("Please enter the Title: ");
							String title = scanner.nextLine();
							System.out.println("Please enter the Authors separated by comma (Firstname LastName): ");
							String authors = scanner.nextLine();

							String[] auhtorsSplit = authors.split(",");
							List<Author> bookAuthors = new ArrayList<>();
							int cnt = 0;
							for(String author : auhtorsSplit) {
								String[] fname_lname = author.split(" ");
								bookAuthors.add(new Author(""+cnt, fname_lname[0], fname_lname[1], null, null, null, null, null, null, null, null));
								cnt++;
							}
							ServiceFactory.getBookService().addBookToCollection(isbn, title, bookAuthors, 1);
							break;
						case "2":
							System.out.println("Please enter the Member ID: ");
							String id = scanner.nextLine();
							System.out.println("Please enter the Member First Name: ");
							String fname = scanner.nextLine();
							System.out.println("Please enter the Member Last Name: ");
							String lname = scanner.nextLine();

							ServiceFactory.getMemberService().addMember(id, fname, lname, null, null, null, null, null);

							break;
						case "3":
							System.out.println("Please enter the book isbn: ");
							String isbnNumber = scanner.nextLine();
							ServiceFactory.getBookService().addBookCopy(isbnNumber);
							
							for(Book book : DataStorage.books) {
								System.out.println(book.getIsbnNumber());
								for(BookCopy bookCopy : book.getCopies()) {
									System.out.println("\t" + bookCopy.getCopyNumber());
								}
							}
							
							break;
						case "4":
							System.out.println("Logged Out");
							isSession = false;
							break;
						default:
							System.out.println("Please select a valid option: ");

						}

					} while (isSession);
					break;
				case "LIBRARIAN":

					do {
						System.out.println("Welcome LIBRARIAN User !!");
						System.out.println("1. CheckOut a book ");
						System.out.println("2. Log Out");
						System.out.print("Please select an option: ");
						String choice = scanner.nextLine();
						isSession = true;

						switch (choice) {

						case "1":

							System.out.println("Please enter the Member ID: ");
							String id = scanner.nextLine();
							System.out.println("Please enter the Book ISBN: ");
							String isbn = scanner.nextLine();
							LocalDate date = LocalDate.now();
							ServiceFactory.getCheckOutService().checkOutBookCopy(id, isbn, date);
							break;
						case "2":
							System.out.println("Logged Out");
							isSession = false;
							break;
						default:
							System.out.println("Please select a valid option: ");

						}

					} while (isSession);
					break;
				default:
					isSession = true;
					do {
						
						System.out.println("Welcome SUPERRR!!! User !!");
						System.out.println("1. CheckOut a book ");
						System.out.println("2. Add a new book");
						System.out.println("3. Add a member");
						System.out.println("4. Add a book copy");
						System.out.println("5. Log Out");
						System.out.print("Please select an option: ");
						
						String choice = scanner.nextLine();

						switch (choice) {

						case "1":
							
							System.out.println("Please enter the Member ID: ");
							String id = scanner.nextLine();
							System.out.println("Please enter the Book ISBN: ");
							String isbn = scanner.nextLine();
							LocalDate date = LocalDate.now();
							ServiceFactory.getCheckOutService().checkOutBookCopy(id, isbn, date);
							break;
						
						case "2":
							System.out.println("Please enter the ISBN: ");
							String isbnNumber = scanner.nextLine();
							System.out.println("Please enter the Title: ");
							String title = scanner.nextLine();
							System.out.println("Please enter the Authors separated by comma (Firstname LastName): ");
							String authors = scanner.nextLine();

							String[] auhtorsSplit = authors.split(",");
							List<Author> bookAuthors = new ArrayList<>();
							int cnt = 0;
							for(String author : auhtorsSplit) {
								String[] fname_lname = author.split(" ");
								bookAuthors.add(new Author(""+cnt, fname_lname[0], fname_lname[1], null, null, null, null, null, null, null, null));
								cnt++;
							}
							ServiceFactory.getBookService().addBookToCollection(isbnNumber, title, bookAuthors, 1);
							break;
						
						case "3":
							
							System.out.println("Please enter the Member ID: ");
							String memberId = scanner.nextLine();
							System.out.println("Please enter the Member First Name: ");
							String fname = scanner.nextLine();
							System.out.println("Please enter the Member Last Name: ");
							String lname = scanner.nextLine();

							ServiceFactory.getMemberService().addMember(memberId, fname, lname, null, null, null, null, null);

							break;
						
						case "4":
							
							System.out.println("Please enter the book isbn: ");
							String bookIsbn = scanner.nextLine();
							ServiceFactory.getBookService().addBookCopy(bookIsbn);
							break;
						
						case "5":
							
							System.out.println("Logged Out");
							isSession = false;
							break;
						
						default:
							System.out.println("Please select a valid option: ");

						}

					} while (isSession);
				}
			}
		} while (true);

	}

}
