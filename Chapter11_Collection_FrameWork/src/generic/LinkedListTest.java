package generic;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		ArrayList<String> yourList = new ArrayList<String>();
		
		yourList.add("A");
		yourList.add("B");
		yourList.add("C");
		yourList.add("D");
		System.out.println(yourList);
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		myList.add("D");
		System.out.println(myList);
		myList.add(1, "F");
		System.out.println(myList);
		myList.removeLast();
		System.out.println(myList);
		
		for(int i=0; i < myList.size(); i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
	}

}
