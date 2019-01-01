package domainClasses;

import java.util.List;

public class Author extends Person {

	private String credentials;
	private String biography;
	private List<Book> booksWritten;

	public Author(String id,String firstName,String lastName,String phoneNumber,String street,String city, String state,String zipCode, 
			String credentials, String biography, List<Book> booksWritten) {
		super (id, firstName, lastName, phoneNumber, street, city,  state, zipCode);
		this.credentials = credentials;
		this.biography = biography;
		this.booksWritten = booksWritten;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public List<Book> getBooksWritten() {
		return booksWritten;
	}

	public void setBooksWritten(List<Book> booksWritten) {
		this.booksWritten = booksWritten;
	}

}
