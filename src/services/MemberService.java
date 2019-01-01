package services;

import domainClasses.CheckOutRecord;
import domainClasses.Member;

public interface MemberService {

	public void addMember(String id, String firstName, String lastName, String phoneNumber, String street,
			String city, String state, String zipCode);
	
	public Member getMemberById(String id);
	
	public void addCheckOutRecordToMember(CheckOutRecord checkoutRecord);
	
	

}
