package services;

public class ServiceFactory {

	private static DataService dataService;
	private static LoginService loginService;
	private static MemberService memberService;
	private static BookService bookService;
	private static CheckOutService checkoutService;
	private static UserService userService;

	public static DataService getDataService() {
		return dataService == null ? new DataServiceImp() : dataService;

	}

	public static LoginService getLoginService() {

		return loginService == null ? new LoginServiceImp() : loginService;

	}

	public static MemberService getMemberService() {

		return memberService == null ? new MemberServiceImp() : memberService;

	}

	public static BookService getBookService() {

		return bookService == null ? new BookServiceImp() : bookService;

	}

	public static CheckOutService getCheckOutService() {

		return checkoutService == null ? new CheckOutServiceImp() : checkoutService;

	}

	public static UserService getUserService() {

		return userService == null ? new UserServiceImpl() : userService;

	}

}
