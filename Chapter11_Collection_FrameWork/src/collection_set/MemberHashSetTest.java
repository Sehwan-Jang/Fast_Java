package collection_set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		 
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberJang = new Member(200, "Jang");
		Member memberKim = new Member(300, "Kim");
		Member memberKim2 = new Member(300, "Kim");
		
		manager.addMember(memberLee);
		manager.addMember(memberJang);
		manager.addMember(memberKim );
		manager.addMember(memberKim2 );
		
		manager.showAllMember();
		
		manager.removeMember(300);
		manager.showAllMember();
	}

}
