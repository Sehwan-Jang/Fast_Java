package thread;

import java.util.ArrayList;

class FastLibrary {
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("태백산맥1");
		books.add("태백산맥2");
		books.add("태백산맥3");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		
		while(books.size() ==0) {  // notifyAll() 때문에 if문이 아닌 while문
			System.out.println(t.getName()+ " : waiting start");
			wait();
			System.out.println(t.getName()+ " : waiting end");
		}
		String title = books.remove(0);
		System.out.println(t.getName() + " : " + title +  " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread t = Thread.currentThread();
		books.add(title);
		notifyAll();
		System.out.println(t.getName() + " : "+ title + " return");
	}
}

class Student extends Thread {
	public void run() {
		
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) return;
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		Student st5 = new Student();
		Student st6 = new Student();
		
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		st6.start();
	}

}
