package domainClasses;

import java.util.List;

public class CheckOutRecord {

	private List<CheckOutEntry> entries;
	private Member member;

	public CheckOutRecord(List<CheckOutEntry> entries, Member member) {
		super();
		this.entries = entries;
		this.member = member;
	}

	public List<CheckOutEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<CheckOutEntry> entries) {
		this.entries = entries;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
