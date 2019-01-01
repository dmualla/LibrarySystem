package services;

import java.util.ArrayList;
import java.util.List;

import data.DataStorage;
import domainClasses.CheckOutRecord;
import domainClasses.Member;

public class MemberServiceImp implements MemberService {

	@Override
	public void addMember(String id, String firstName, String lastName, String phoneNumber, String street, String city,
			String state, String zipCode) {
		
		List<Member> members1 = DataStorage.members;
		
		Member member = new Member(id, firstName, lastName, phoneNumber, street, city, state, zipCode);
		members1.add(member);
		System.out.println("Member : "+member.getFirstName()+" "+member.getLastName()+" with ID : "+member.getId() +" added to storage");
	}

	@Override
	public Member getMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCheckOutRecordToMember(CheckOutRecord checkoutRecord) {
		// TODO Auto-generated method stub

	}

}
