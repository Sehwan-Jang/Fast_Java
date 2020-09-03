package collection_treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		 
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberJang = new Member(200, "Jang");
		Member memberKim = new Member(300, "Kim");
		
		manager.addMember(memberLee);
		manager.addMember(memberJang);
		manager.addMember(memberKim );
		
		manager.showAllMember();
		
		manager.removeMember(300);
		manager.showAllMember();
	}

}
