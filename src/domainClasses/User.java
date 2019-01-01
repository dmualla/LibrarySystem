package domainClasses;

public class User extends Person {

	private String userName;
	private String password;
	private AuthorizationLevel level;
	
	public User(String id, String firstName, String lastName, String phoneNumber, String street, String city,
			String state, String zipCode, String userName, String password, AuthorizationLevel level) {
		super(id, firstName, lastName, phoneNumber, street, city, state, zipCode);
		this.userName = userName;
		this.password = password;
		this.level = level;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AuthorizationLevel getLevel() {
		return level;
	}

	public void setLevel(AuthorizationLevel level) {
		this.level = level;
	}

}
