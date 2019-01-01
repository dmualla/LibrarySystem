package services;

import data.DataStorage;
import domainClasses.User;

public class DataServiceImp implements DataService {

	@Override
	public User checkCredentials(String userName, String password) {
		for (User user : DataStorage.users) {
			if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

}
