package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> slist = new ArrayList<String>();
		slist.add("Tomas");
		slist.add("Edward");
		slist.add("Jack");
		slist.add("Stark");
		
		Stream<String> stream = slist.stream();
		stream.forEach(s-> System.out.print(s+" "));
		System.out.println();
		
		slist.stream().sorted().forEach(s -> System.out.print(s+" "));
		System.out.println();
		slist.stream().map(s-> s.length()).forEach(n->System.out.print(n));
	}

}
