package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥", "소정희");
		library[1] = new Book("태백산맥", "소정희");
		library[2] = new Book("태백산맥", "소정희");
		library[3] = new Book("태백산맥", "소정희");
		library[4] = new Book("태백산맥", "소정희");
		
		
		for (int i = 0; i < library.length; i++) {  // 깊은 복사 
			copyLibrary[i] = new Book();
			copyLibrary[i].setAuthor(library[i].getAuthor()); 
			copyLibrary[i].setTitle(library[i].getTitle()); 
		}
		
		library[0].setTitle("나무");
		library[0].setAuthor("박완서");
		  
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("-----------------------");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
	}
}
