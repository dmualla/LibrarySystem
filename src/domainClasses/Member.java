package domainClasses;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person {

	private List<CheckOutRecord> checkOutRecords;

	public Member(String id, String firstName, String lastName, String phoneNumber, String street, String city,
			String state, String zipCode) {
		super(id, firstName, lastName, phoneNumber, street, city, state, zipCode);
		checkOutRecords = new ArrayList<>();
	}

	public void addRecord(CheckOutRecord checkOutRecord) {
		checkOutRecords.add(checkOutRecord);
	}
}
