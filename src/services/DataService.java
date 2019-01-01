package services;

import domainClasses.User;

public interface DataService {
	User checkCredentials(String userName, String password);
}
