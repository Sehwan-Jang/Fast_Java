package collection_treeset;


public class Member implements Comparable<Member>{

	private int memberID;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberID+"입니다.";
	}

	@Override
	public int hashCode() {
		return memberID;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return memberID == member.memberID;
		}
		return false;
	}

//	@Override
//	public int compare(Member member1, Member member2) {
//		return (member1.memberID - member2.memberID);
//	}

	@Override
	public int compareTo(Member member) {
		return (this.memberID - member.memberID);
	}

	
	
}
