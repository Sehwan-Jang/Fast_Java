package collection_treemap;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>(Collections.reverseOrder());
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			treeMap.remove(memberID);
			return true;
		}
		System.out.println("회원 번호가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
}
