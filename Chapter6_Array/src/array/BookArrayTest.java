package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥", "소정희");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}
