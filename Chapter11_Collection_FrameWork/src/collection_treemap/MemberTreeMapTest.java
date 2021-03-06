package collection_treemap;


public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberJang = new Member(100, "장세환");
		Member memberLee = new Member(200, "이순신");
		Member memberKim = new Member(300, "김좌진");
		Member memberKim2 = new Member(400, "김유신");
		
		manager.addMember(memberJang);
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberKim2);
		
		manager.showAllMember();
		manager.removeMember(200);
		manager.showAllMember();			
		
	}

}
