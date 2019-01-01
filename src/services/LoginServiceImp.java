package services;

import domainClasses.User;

public class LoginServiceImp implements LoginService {
	DataService dataService = ServiceFactory.getDataService();

	@Override
	public String login(String userName, String password) {
		
		User user = dataService.checkCredentials(userName, password);
			
		if (user == null)
			return "";
		else {
			 return user.getLevel().toString();
		}
	}

}
